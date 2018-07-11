import re
import glob


def updateToImg(filename):
    file = open(filename, 'r')
    content = file.read()

    # Works
    # (\\bgroup \\tikzset\{png export\} \\begin\{tikzpicture\})(.*?)(\\end\{tikzpicture\} \\egroup)
    p = re.compile(r'(\\bgroup \\tikzset\{png export\} \\begin\{tikzpicture\})(.*?)(\\end\{tikzpicture\} \\egroup)', re.DOTALL)

    print(re.findall(p, content)) # TODO - Remove me; testing purposes
    for x in re.findall(p, content):
        print(x)

    content = re.sub(p, "<img src=\"./../fig/classesObjects/classesObjects-ClassUMLDiagram.png\" alt=\"Drawing\" width = \"400\"/>", content)

    file.close()

    newFileName = filename[filename.rfind('/') + 1:]
    file = open('output/{}'.format(newFileName), 'w+')
    file.write(content)
    file.close()

for filename in glob.iglob('latexPackage/**/**.tex', recursive=True):
    updateToImg(filename)
