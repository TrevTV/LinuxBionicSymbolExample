## Problem is caused by an outdated NDK. Using 27+, at least for .NET 9, works correctly.

### TL;DR of the problem

When compiling a NativeAOT assembly for linux-bionic-arm64 using .NET 9.0.102 (set in `global.json`), it compiles and runs normally.

When compiling the same assembly, but instead on .NET 9.0.103 (also set in `global.json`), it compiles but fails to load due to the following error.
```
java.lang.UnsatisfiedLinkError: dlopen failed: cannot locate symbol "__aarch64_cas16_acq_rel" referenced by "/data/app/~~Y6IeYBqGjhnjqVvMUKAG_g==/app.trev.naotloader-X9_xowBAe5-seTAfiyJzXQ==/lib/arm64/libnaotlib.so"...
```
The same error occurs on the latest release SDK, 9.0.300.

Built using NDK r21e on Windows 11.

The library was built with the included batch script which just calls `dotnet restore` and `publish` with the `linux-bionic-arm64` runtime identitifer and some flags.

The app was built using `gradlew installDebug`. The currently included library was built with 9.0.300.
