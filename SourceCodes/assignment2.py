#!/usr/bin/python
#
# CS 7200: Algorithm Design and Analysis
#
# Template python file with sample code for reading files in python
#
# Be sure to put your names and assignment info in comments up here
#
####

with open("input.txt") as f:
    B=[[i.strip() for i in line.split(",")] for line in f.read().splitlines()]
