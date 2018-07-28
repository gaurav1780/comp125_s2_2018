import re
import glob

exclude = ['_collections/_extras/', '_collections/_episodes/',] # Don't generate titles for these folders
generateNav = True # Generate new navigation after generating titles

def generate(path):

    file = open(path, 'r')
    content = file.read()

    p = re.compile(r'^# (.*)', re.M) # Find title based on #
    title = re.findall(p, content)

    if len(title) == 0: # kind of messy, refactor?
        print("No title found for '{}'".format(path))
        return
    else:
        title = title[0]

    p = re.compile(r'^---\ntitle(.*?)\n---', re.MULTILINE) # Remove old title
    content = re.sub(p, "", content)

    newTitle = '---\ntitle: "{}"\n---'.format(title)
    content = newTitle + content

    file = open(path, 'w') # Replace old file with new
    file.write(content)
    file.truncate()
    file.close()


for filename in glob.iglob('_collections/**/**.md', recursive=True):
    if all(s not in filename for s in exclude):
        generate(filename)

if generateNav:
    import makeNavigationList
