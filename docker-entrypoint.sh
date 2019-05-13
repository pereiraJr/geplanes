#!/bin/bash
set -e

psql -h localhost -U postgres -d geplanes_bsc < geplanes-3.0.5_new.sql