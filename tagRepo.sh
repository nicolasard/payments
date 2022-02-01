#!/bin/bash
# Script to tag the repo

echo $NEXT_VERSION

git tag -a $NEXT_VERSION -m "Automatic tag to ${NEXT_VERSION}"
