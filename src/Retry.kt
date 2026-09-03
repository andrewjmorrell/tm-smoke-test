
// PROVENANCE-BEGIN: HUMAN-AUTHORED  Developer: you  Trace: T-smoke1  DDR: DDR-smoke1

fun backoff(n: Int) = (1 shl n).coerceAtMost(30)

// PROVENANCE-END: HUMAN-AUTHORED

