@echo off

echo start OracleDBConsoleorcl

net start "OracleDBConsoleorcl"

echo start OracleMTSRecoveryService

net start "OracleMTSRecoveryService"

echo start OracleOraDb11g_home1TNSListener

net start "OracleOraDb11g_home1TNSListener"

echo start OracleServiceORCL

net start "OracleServiceORCL"

echo done.
