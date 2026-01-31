#!/bin/bash -e

cp /run/secrets/adminpassword /opt/domjudge/domserver/etc/initial_admin_password.secret
echo "default http://localhost/api judgehost $(cat /run/secrets/apipassword)" > /opt/domjudge/domserver/etc/restapi.secret
