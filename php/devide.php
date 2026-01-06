<?php
$string = "This is a test. This test is only a test";

$string = str_replace(".", "", $string); // Remove dot(not a word)


$words = explode(" ", $string); // Devide string into words

$count = array(); // Count array

foreach ($words as $word) {
    if (isset($count[$word])) {
        $count[$word]++;
    } else {
        $count[$word] = 1;
    }
}

// Print the counts
foreach ($count as $word => $value) {
    echo $word . " : " . $value . "   ";
}
?>