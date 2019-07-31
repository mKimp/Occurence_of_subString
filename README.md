# Occurrence_of_subString
[![Build Status](https://travis-ci.com/mKimp/occurence_of_subString.svg?branch=master)](https://travis-ci.com/mKimp/occurence_of_subString)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)]()

The program takes the arguments, which contains two strings. The first argument is the pattern, and the second argument is the string of substrings, split by "|". The program returns back the number of times the pattern is present in each substring and the total number of matches.

<!--project description-->

## Tech stack, Tools, Prerequisites and Setup
- [x] Java
- [x] IntelliJ
- [x] Git
- [x] Travis-CI

## Example 1

    - The arguments are ("bc","bcdefbcbebc|abcdebcfgsdf|cbdbesfbcy|1bcdef232423bc32");
    - Returned result is 3|2|1|2|8

## Example 2
    - The arguments are (" ","bcdefbcbebc|abcdebcfgsdf|cbdbesfbcy|1bcdef232423bc32");
    - Returned result is 0|0|0|0|0
