Step by Step approach in explaining how performance of a service is affected by different thread configurations
# Test Setup
•	1000 threads spinning up and hitting continuously
•	Service is expected to respond with 1 sec delay
# Step 1 – No Thread Configurations
public String getSampleResponseString() {
        try {
            iHitsCountSinceLaunch++;
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        return "HitCount : " + iHitsCountSinceLaunch;
    }

Observations Summary
1. Beyond 140 threads, response time increased to 5.5 sec
2. CPU Utilization was less than 15%. But, service could not handle more than 140 TPS
3. Thread creation is costly and for the first time, when threads are created, CPU Usage is high