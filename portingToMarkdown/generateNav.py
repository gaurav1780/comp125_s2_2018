import re
import glob

def generate(path):
    file = open(path, 'r')
    content = file.read()

    p = re.compile(r'(.*?)\n={3,}', re.M)
    output = 'navigation: \n'

    for x in re.findall(p, content):
        characters = ["\"", "“", "”", "*"]
        for character in characters:
            x = x.replace(character, "")

        if x[0] == "`": # ' at start of nav breaks nav, remove if found
            x = x.replace("`", "", 2)

        output += ('- id: ' + x + '\n')

    file.close()

    newFileName = path[path.rfind('/') + 1:]
    file = open ('navigation/{} navigation'.format(newFileName), 'w+')
    file.write(output)
    file.close()


for filename in glob.iglob('final/**.md', recursive=True):
    generate(filename)

