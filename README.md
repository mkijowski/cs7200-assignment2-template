## CS7200 Assignment 2
Submitted by:


### Repoository details
This repo serves to simply outline the requirements for the second assignment of
CS 7200.  Please use at your own risk (requirements may change and I may not
update this repo).

### The Skyline Problem

Given a set of (rectangular) buildings *B* arranged in order from left to right in a city as
described below, your solution should output a list of tuples of x-coordinates and heights
that would correspond to the outer shape *S* (rectangular strips) of the Skyline buildings.
A rectangular strip is represented as a pair *( h , l )* where *h* is the height of a strip and *l* is
the *x* coordinate of the left side of a strip.
A building *B<sub>i</sub>* is represented as a triplet *( H<sub>i</sub> , Lx<sub>i</sub> , Rx<sub>i</sub> )*, where *H<sub>i</sub>* is the height of the
building, and *Lx<sub>i</sub>* and *Rx<sub>i</sub>* are the left and right x-coordinates *(0 < Lx<sub>i</sub> < Rx<sub>i</sub> )*. Assume
that all the numbers used are **non-negative integers** (i.e., *N* including 0 as appropriate).

