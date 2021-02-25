<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHPt</title>
</head>
<body>
    <?php
    require_once ("car.php");
    require_once ("account.php");
    $car = new Car ("LLLSQ123", new Account ("Pablo Zuniga", 6627132));
    $car->printDataCar();
    ?>
</body>
</html>