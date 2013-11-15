<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Blackjack</title>
</head>
<body>

<div>
    <h1>Dealers Hand</h1>

    ${game.dealersHand.toString()}

    <h2>Totals</h2>

    ${game.dealersHand.totals}

</div>

<div>
    <h1>Players Hand</h1>

    ${game.playersHand.toString()}

    <h2>Totals</h2>

    ${game.playersHand.totals}

</div>


<form method="POST">
<input value="Deal" name="deal" type="submit" id="dealButton" class="submit_button">
</form>

</body>
</html>