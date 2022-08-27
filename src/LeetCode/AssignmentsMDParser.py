# ======================================================
# Copyright (c) Amey Bhilegaonkar. All rights reserved.
# AUTHOR: AMEY BHILEGAONKAR
# PORTFOLIO: https://ameyportfolio.netlify.app
# ======================================================

import sys
import os
import pathlib

# THIS FILE IS RESPONSIBLE TO CREATE THOSE .JAVA OR .PY FILES FOR WHICH
# KUNAL KUSHWAHA HAS UPLOADED ASSIGNMENT.MD TO HIS GITHUB

# DEFAULT COMMAND TO RUN THIS FILE IS
# python AssignmentsMDParser.py DataStructures Arrays py

# SEND ARGUMENTS TO PYTHON FILE WHERE YOU WANT TO CREATE FILE AND
# STORE THE ASSIGNMENTS.MD FILE IN THE FOLDER IN WHICH YOU WANT TO CREATE
# THE PYTHON/JAVA FILES
arguments = sys.argv[1:]
print(arguments)
# arg[0] - FIRST ARGUMENT IS THE SUB-FOLDER UNDER THE PARENT DIRECTORY
# WHERE EACH OF THE CHILD FOLDERS/ ASSIGNMEND.MD FILE IS KEPT
SUB_FOLDER = arguments[0]

# args[1] - SECOND ARGUMENT WHERE THE ASSIGNMENTS.MD FILE WILL BE KEPT
MDPath = arguments[1]

# args[2] - THIRD ARGUMENT WILL BE THE FILE EXTENSION FOR THE FILES TO BE
# CREATED
FileExtension = arguments[2]

# args[3] - FOURTH ARGUMENT WILL BE ASSIGNMENT.MD FILE NAME IF ITS DIFFERENT
MDFileName = arguments[3]

BASE_PATH = pathlib.Path().resolve()

MDFILE_FULL_PATH = os.path.join(BASE_PATH, SUB_FOLDER, MDPath, MDFileName)

ParentFolderPath = os.path.join(BASE_PATH, SUB_FOLDER, MDPath)
FolderName = ""

defaultString = """
{cmt} ======================================================
{cmt} Copyright (c) Amey Bhilegaonkar. All rights reserved.
{cmt} AUTHOR               : AMEY BHILEGAONKAR
{cmt} PORTFOLIO            :https://ameyportfolio.netlify.app
{cmt} LEETCODE PROBLEM LINK: {links}
{cmt} ======================================================
"""
if FileExtension == "java":
    cmtString = "//"
else:
    cmtString = "#"

with open(MDFILE_FULL_PATH, 'r') as f:

    for lineIndex, lineData in enumerate(f):


        if '#' in lineData:
            continue
        else:

            # lineData = (lineData.split("]"))[2:]
            if (len(lineData) <= 2):
                continue
            else:

                fileNameLine = str(str(str(lineData).split("]")[0])[2:].split("[")[1:])
                # print(fileNameLine)
                fileName = fileNameLine.replace(". [","").replace("']","").replace("[","").replace("'", "").replace(" ", "_") + "." + FileExtension
                # print(fileName)
                link = str(str(lineData).split("]")[1])[1:].replace(")", "")
                # print(link)
                copyrightContent = defaultString.format(cmt=cmtString,links=link)

                destinationFileName = os.path.join(ParentFolderPath, fileName)

                # print(fileName, link)
                f = open(destinationFileName, "w")
                f.write(copyrightContent)
                f.close()

                # print("files Created at: {}".format(destinationFileName))
