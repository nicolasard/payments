#!/bin/bash
# Script to tag the repo

echo Taggin next version $env.NEXT_TAG

git tag -a $env.NEXT_TAG -m "Automatic tag to ${env.NEXT_TAG}"
