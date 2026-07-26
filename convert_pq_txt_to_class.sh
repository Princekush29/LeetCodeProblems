#!/bin/zsh

# Convert all .txt files to .class files in the pq source folder
# Usage:
#   chmod +x convert_pq_txt_to_class.sh
#   ./convert_pq_txt_to_class.sh

DIR="/Users/shreeram/eclipse-workspace/LeetCodeProblems/src/pq"

echo "Scanning: $DIR"

count=0
for f in "$DIR"/*.txt; do
  # If the glob didn't match any files, the loop receives the literal pattern
  if [ ! -e "$f" ]; then
    break
  fi
  target="${f%.txt}.class"
  echo "Renaming: $f -> $target"
  mv "$f" "$target"
  count=$((count+1))
done

if [ "$count" -eq 0 ]; then
  echo "No .txt files found in $DIR"
else
  echo "Renamed $count files to .class"
fi
