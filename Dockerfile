FROM library/postgres:8.4

COPY ./geplanes-3.0.5_new.sql /

COPY ./migrations.txt /

ENV POSTGRES_DB geplanes_bsc

EXPOSE 5432