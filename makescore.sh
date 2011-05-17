#!/bin/bash
du -bc ./*.clj | sort -nr > score.txt
