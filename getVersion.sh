#!/bin/bash
# Script to get the next version based on git tags


echo "Script to get last git version"
MAJOR=0
echo "Major version: $MAJOR"
#LAST_VERSION=$(git describe --match "v$MAJOR.[0-9]*" --abbrev=0 HEAD)
LAST_VERSION=$(git describe --match "v$MAJOR.[0-9]*" --abbrev=0 --tags)
if [ -z "${LAST_VERSION}" ]; then
    echo "No minor version tag found for the current major version, creating the first minor..."
    LAST_VERSION=0
fi
echo "Last version: $LAST_VERSION"
LAST_MINOR_VERSION=$(echo $LAST_VERSION |sed "s|v${MAJOR}.\([0-9\.]*\).*|\1|")
NEXT_MINOR_VERSION=$(($LAST_MINOR_VERSION+1))
NEXT_TAG="v${MAJOR}.${NEXT_MINOR_VERSION}"
echo "Next version: $NEXT_TAG"
export NEXT_VERSION=$NEXT_TAG
echo "Use the env. variable NEXT_VERSION to tag and compile the app. LAST_VERSION var is also available" 
