#!/usr/bin/env python3
import os
from os import path
from ruamel.yaml import YAML
import frontmatter
from pprint import pprint

CONFIG = '_config.yml'
DEST_FILE = 'navigation-list.yml'
DATA_DIR = '_data'


def dump(filepath, yaml, objyaml):
    """Dump the values from the dictionary of objyaml into the file specfiy
    by filepath."""
    def startendlines(s):
        """Prepend and append `---` around the str s."""
        return "---\n{0}---\n".format(s)
    with open(filepath, 'w') as targetyamlfile:
        yaml.dump(objyaml, targetyamlfile, transform=startendlines)


def pretty_str(str):
    """Return the a version of str with '-' and '_' characters replaced
    by ' ' (space) character and a titlecased version of str."""
    new_str = str
    for ch in ['-', '_']:
        new_str = new_str.replace(ch, ' ')
    return new_str.title().strip()


# Check if `_data` exist, else make `_data` directory.
if not path.exists(DATA_DIR):
    os.mkdir(DATA_DIR)

# Open `_config.yml` file of the project and store the value of the front
# matter variable `collections_dir` into the COLLECTIONS_DIR_NAME.
with open(CONFIG) as config_file:
    CONFIG_YAML = YAML().load(config_file.read())
    COLLECTIONS_DIR_NAME = CONFIG_YAML['collections_dir']

ROOT = os.getcwd()
COLLECTION_DIR_FULL_PATH = ROOT + '/' + COLLECTIONS_DIR_NAME

# List of collection names that begin with a digit, because all
# collection directory must be prepended with a '_' (underscore)
# character, we check if the 2nd character is a digit
DIR_LIST = [
    item for item in sorted(
        os.listdir(COLLECTIONS_DIR_NAME)) if os.path.isdir(
            os.path.join(
                COLLECTIONS_DIR_NAME,
                item)) and item[1].isdigit()]

# Name of the front matter variable
FRONT_MATTER_LIST_NAME = 'navigation_list'

# The dictionary that will store the front matter
NAV_LIST = {FRONT_MATTER_LIST_NAME: []}

# For each directory from DIR_LIST, create a list that stores
# the title of the file and the link of the file.
for dir_name in DIR_LIST:
    pretty_dir_name = pretty_str(dir_name[3:])
    NAV_LIST[FRONT_MATTER_LIST_NAME].append(
        {'id': dir_name[1:], 'title': pretty_dir_name, 'links': []})
    full_dir_name = COLLECTIONS_DIR_NAME + '/' + dir_name
    for file in sorted(os.listdir(full_dir_name)):
        filename = os.fsdecode(file)
        title = ''
        page_path = full_dir_name + '/' + filename
        # Link is the filename excluding the file extension
        link = filename.split(".")[0]
        with open(page_path) as page_file:
            PAGE_YAML, content = frontmatter.parse(page_file.read())
            # If file have 'title' front matter variable then that will
            # be the value in navigation-list.yml for that file,
            # otherwise the title will be version of the link with the
            # prepend 'xx-' removed, where 'xx' is a digit and the
            # word is titlecased and all '-' character in the string
            # is replaced with the ' ' character.
            if 'title' in PAGE_YAML:
                title = PAGE_YAML['title']
            else:
                title = pretty_str(link[3:])
        NAV_LIST[FRONT_MATTER_LIST_NAME][-1]['links'].append(
            {'title': title, 'link': link})

# Write the content of NAV_LIST
FULL_OUTPUT_PATH = DATA_DIR + '/' + DEST_FILE
dump(FULL_OUTPUT_PATH, YAML(), NAV_LIST)

pprint(NAV_LIST)
