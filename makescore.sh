#!/bin/bash
du -cb --exclude=embed_* *.clj | sort -nr > score.txt
