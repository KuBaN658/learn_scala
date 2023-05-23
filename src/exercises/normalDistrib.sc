def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
  1 / (sigma * Math.sqrt(2 * Math.PI)) * Math.exp((-(x - mu) * (x - mu)) / (2 * sigma * sigma))
}

normalDistribution(0, 1, 2)

Math.pow(5, 3)