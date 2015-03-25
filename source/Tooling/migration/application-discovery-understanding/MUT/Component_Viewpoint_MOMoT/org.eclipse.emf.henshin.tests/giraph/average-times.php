<?php
$groupsize = $argv[1];

$handles = array();
for ($i=2; $i<sizeof($argv); $i++) {
  $handles[] = fopen($argv[$i], "r");
}
$samplecount = sizeof($argv) - 2;
$step = 0;
$time = 0;
$i = 0;
while (true) {
  foreach ($handles as $h) {
    $stats = fscanf($h, "%d %d\n");
    if (!$stats) {
      break 2;
    }
    list($step,$t) = $stats;
    $time = $time + $t;
  }
  if ($i % $groupsize == $groupsize-1) {
    echo ($time/$samplecount)."\n";
    $time = 0;
  }
  $i++;
}

foreach ($handles as $h) {
  fclose($h);
}
?>
