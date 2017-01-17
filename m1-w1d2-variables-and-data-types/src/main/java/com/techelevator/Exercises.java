package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        // This is a single line comment
		
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		int birdsOnBranch = 4;
		int birdsFlewAway = 1;
		int birdsLeft = birdsOnBranch - birdsFlewAway;
		System.out.println("Birds Left: " + birdsLeft);
		
        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */

		int birds = 6;
		int nests = 3;
		int birdsWithoutNests = birds - nests;
		System.out.println("Birds without nests: " + birdsWithoutNests);
	

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		
		int raccoonsPlayingInTheWoods = 3;
		int racconsHomeToEatDinner = 2;
		int raccoonsLeftInTheWoods = raccoonsPlayingInTheWoods - racconsHomeToEatDinner;
		System.out.println("Raccoons left in the woods: " + raccoonsLeftInTheWoods);
		
		
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
		int flowers = 5;
		int bees = 3;
		int differenceBetweenFlowersAndBees = flowers - bees;
		System.out.println("Difference between flowers and bees: " + differenceBetweenFlowersAndBees);
		
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
		int pigeonEatingBreadcrumbs = 1;
		int additionalPigeon = 1;
		int totalPigeonsEatingBreadcrumbs = pigeonEatingBreadcrumbs + additionalPigeon;
		System.out.println("Total pigeons eating breadcrumbs: " + totalPigeonsEatingBreadcrumbs);
		
		
        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
		int owlsSittingOnTheFence = 3;
		int owlsJoining = 2;
		int totalOwlsOnTheFence = owlsSittingOnTheFence + owlsJoining;
		System.out.println("Total owls sitting on fence: " + totalOwlsOnTheFence);
		
        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
		int beaversWorkingOnTheirHome = 2;
		int beaversWentForASwim = 1;
		int beaversStillWorkingOnTheirHome = beaversWorkingOnTheirHome - beaversWentForASwim;
		System.out.println("Beavers still working on their home: " + beaversStillWorkingOnTheirHome);
		
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
		int toucansSittingOnATreeLimb = 2;
		int toucansJoining = 1;
		int totalToucans = toucansSittingOnATreeLimb + toucansJoining;
		System.out.println("Total toucans sitting on a tree limb: " + totalToucans);
		
        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
		int squirrels = 4;
		int nuts = 2;
		int squirrelsAndNutsDifference = squirrels - nuts;
		System.out.println("There are " + squirrelsAndNutsDifference + " more squirrels than nuts.");
		
		
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
		int quartersFound = 1;
		int dimesFound = 1;
		int niquelsFound = 2;
		
		float valueInQuarters = quartersFound * 0.25f;
		float valueInDimes = dimesFound * 0.1f;
		float valueInNiquels = niquelsFound * 0.05f;
		
		float totalMoneyFound = valueInQuarters + valueInDimes + valueInNiquels;
		System.out.println("Mrs. Hilt found: " + totalMoneyFound);
		
        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
		int mrsBrierClassMuffins = 18;
		int mrsMacadamsClassMuffins = 20;
		int mrsFlanneryClassMuffins = 17;
		int mrsHiltFirstGradeClassesTotalMuffins = mrsBrierClassMuffins + mrsMacadamsClassMuffins + mrsFlanneryClassMuffins;
		System.out.println("Total first grade muffins: " + mrsHiltFirstGradeClassesTotalMuffins);
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        int yoyoCost = 24;
        int whistleCost = 14;
        int mrsHiltTotalSpending = yoyoCost + whistleCost;
        System.out.println("Mrs. Hilt spent " + mrsHiltTotalSpending + " cents for the two toys.");
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int largeMarshmallows = 8;
        int miniMarshmallows = 10;
        int totalMarshmallows = largeMarshmallows + miniMarshmallows;
        System.out.println("Mrs. Hilt used a total of " + totalMarshmallows + " marshmallows.");
        
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int snowAtMrsHiltsHouse = 29;
        int snowAtBrecknockElementarySchool = 17;
        int differenceInSnowfall = snowAtMrsHiltsHouse - snowAtBrecknockElementarySchool;
        System.out.println("Mrs's Hilt had " + differenceInSnowfall + " more inches of snow than Brecknock Elementary School.");
        
        
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        float mrsHiltMoney = 10f;
        float toyTruckCost = 3f;
        float pencilCaseCost = 2f;
        float remainingMoney = mrsHiltMoney - toyTruckCost - pencilCaseCost;
        System.out.printf("Mrs. Hilt has $%.2f left.\n", remainingMoney);
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int joshMarbles = 16;
        int lostMarbles = 7;
        int remainingMarbles = joshMarbles - lostMarbles;
        System.out.println("Josh has " + remainingMarbles + " marbles left.");
        
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int meganSeashells = 19;
        int meganTotalSeashells = 25;
        int meganSeashellsToFind = meganTotalSeashells - meganSeashells ;
        System.out.println("Megan needs to find " + meganSeashellsToFind + " more seashells.");
        
        
        
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int bradTotalBalloons = 17;
        int redBalloons = 8;
        int greenBallons = bradTotalBalloons - redBalloons;
        System.out.println("Brad has " + greenBallons + " green balloons");
        
        
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int booksOnTheShelf = 38;
        int marthaBooksOnTheShelf = 10;
        int totalBooksOnShelf = booksOnTheShelf + marthaBooksOnTheShelf ;
        System.out.println("There are " + totalBooksOnShelf + " books on the shelf now.");
        
        
        
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int numberOfLegsOfBee = 6;
        int numberOfBees = 8;
        int totalNumberOfBeeLegs = numberOfBees * numberOfLegsOfBee;
        System.out.println("Eight bees have " + totalNumberOfBeeLegs + " legs altogether.");
        
        
        
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        float iceCreamCost = 0.99f;
        float totalIceCreamCost = iceCreamCost * 2;
        System.out.println("Two ice cream cones cost $" + totalIceCreamCost + "." );
        
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int rocksToCompleteBorder = 125;
        int mrsHiltNumberORocks = 64;
        int remainingRocks = rocksToCompleteBorder - mrsHiltNumberORocks;
        System.out.println("Mrs. Hilt needs " + remainingRocks + " rocks to complete the border.");
        
        
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int mrsHiltMarbles = 38;
        int mrsHiltLostMarbles = 15;
        int mrsHiltRemainingMarbles = mrsHiltMarbles - mrsHiltLostMarbles;
        System.out.println("Mrs. Hilt has " + mrsHiltRemainingMarbles + " marbles left.");
        
        
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int distanceToConcert = 78;
        int distanceToGasStation = 32;
        int milesLeftToDrive = distanceToConcert - distanceToGasStation;
        System.out.println("They have "+ milesLeftToDrive + " miles left to drive.");
        
        
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        int minutessShoveledOnSaturdayAm = 90;
        int minutesShoveledOnSaturdayPm = 45;
        int totalMinutesShovelingSnow = minutessShoveledOnSaturdayAm + minutesShoveledOnSaturdayPm;
        int hoursShovelingSnow = totalMinutesShovelingSnow / 60;
        int additionalMinutesShovelingSnow = totalMinutesShovelingSnow % 60;
        System.out.println("She spent " + hoursShovelingSnow + " hours and " + additionalMinutesShovelingSnow + " minutes shoveling snow.");
        
        
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        int totalnumberOfHotDogs = 6;
        float hotDogCost = 0.50f;
        float totalHotDogCost = totalnumberOfHotDogs * hotDogCost ;
        System.out.printf("Mrs. Hilt paid $%.2f for all of the hot dogs.\n", totalHotDogCost);
        
      
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        int mrsHiltTotalMoney = 50;
        int costOFOnePencil = 7;
        int totalOFPencilsMrsHiltCanBuy = mrsHiltTotalMoney / costOFOnePencil ;
        System.out.println("Mrs. Hilt can buy " + totalOFPencilsMrsHiltCanBuy + " pencils with the money she has.");
        
        
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int butterfliesSeenByMrsHilt = 33;
        int orangeButterflies = 20;
        int redButterflies = butterfliesSeenByMrsHilt - orangeButterflies ;
        System.out.println(redButterflies + " of the butterflies were red.");
        
        
        
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        
        float cashHandedToClerk = 1.0f;
        float costOfCandy = 0.54f;
        float changeForKate = cashHandedToClerk - costOfCandy;
        System.out.printf("Kate should get $%.2f back in change.\n", changeForKate);
        
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int markBackyardTrees = 13;
        int treesToBePlanted = 12;
        int totalTrees = markBackyardTrees + treesToBePlanted;
        System.out.println("Mark will have " + totalTrees + " trees total.");
        
        
        
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int daysToSeeGrandma = 2;
        int hoursInOneDay = 24;
        int hoursToSeeGrandma = daysToSeeGrandma * hoursInOneDay;
        System.out.println("Joy will see her grandma in " + hoursToSeeGrandma + " hours." );
        
        
        
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int kimNumberOfCousins = 4;
        int piecesOfGumForEachCousin = 5;
        int totalPiecesOfGumNeeded = kimNumberOfCousins * piecesOfGumForEachCousin ;
        System.out.println("Kim will need " + totalPiecesOfGumNeeded + " pieces of gum.");
       
        
        
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        float totalMoneyDanHas = 3f;
        float costOfCandyBar = 1f;
        float changeForDan = totalMoneyDanHas - costOfCandyBar;
        System.out.printf("There is $%.2f left.\n", changeForDan);
        
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int numberOfBoatsInTheLake = 5;
        int numberOfPeopleOnEachBoat = 3;
        int totalNumberOfPeopleInTheLake = numberOfBoatsInTheLake * numberOfPeopleOnEachBoat;
        System.out.println("There are " + totalNumberOfPeopleInTheLake + " people on boats in the lake.");
        
        
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int numberOfLegosEllenHas = 380;
        int lostLegos = 57;
        int remainingLegos = numberOfLegosEllenHas - lostLegos;
        System.out.println("Ellen has " + remainingLegos + " legos now.");
        
        
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int arthurMuffins = 35;
        int totalNumberOfMuffinsDesired = 83;
        int additionalMuffinsNeeded = totalNumberOfMuffinsDesired - arthurMuffins;
        System.out.println("Arthur has to bake " + additionalMuffinsNeeded + " more muffins.");
        
        
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int willyCrayons = 1400;
        int lucyCrayons = 290;
        int willyAndLucyCrayonsDifference = willyCrayons - lucyCrayons;
        System.out.println("Willy has " + willyAndLucyCrayonsDifference + " more crayons then Lucy.");
        
        
        
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int numberOfStickersOnAPage = 10;
        int numberOFPagesWithStickers = 22;
        int totalNumberOfStickers = numberOfStickersOnAPage * numberOFPagesWithStickers;
        System.out.println("I have " + totalNumberOfStickers + " stickers.");
        
       
        
        
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int totalOfCupcakes = 96;
        int totalOfChildren = 8;
        int totalOfCupcakesPerChild = totalOfCupcakes / totalOfChildren;
        System.out.println("Each child will get " + totalOfCupcakesPerChild + " cupcakes.");
        
        
        
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int totalGingerbreadCookies = 47;
        int cookiesPerJar = 6;
        int remainingCookies = totalGingerbreadCookies % cookiesPerJar;
        System.out.println(remainingCookies + " cookies will not be placed in a jar.");
        
   
       
        
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int totalNumberOfCroissants = 59;
        int totalNumberOFNeighbors = 8;
        int remainderNumberWithMarian = totalNumberOfCroissants % totalNumberOFNeighbors;
        System.out.println("There will be " + remainderNumberWithMarian + " croissants with Marian.");
        
        
        
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int totalOatmealCookiesNeeded = 276;
        int totalNumberOfCookiesPerTray = 12;
        int totalOfTrays = totalOatmealCookiesNeeded / totalNumberOfCookiesPerTray;
        System.out.println("She will need " + totalOfTrays + " trays.");
        
        
        
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int numberOfPretzels = 480;
        int sizeOfServing = 12;
        int numberOfPretzelServings = numberOfPretzels / sizeOfServing;
        System.out.println("Marion was able to prepare " + numberOfPretzelServings  + " servings.");
        
        
        
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int numberOfLemonCupcakes = 53;
        int numberOFLemonCupkaesLeftAtHome = 2;
        int numberOfLemonCupcakesGivenAway = (numberOfLemonCupcakes - numberOFLemonCupkaesLeftAtHome) /3;
        System.out.println("There were " + numberOfLemonCupcakesGivenAway + " boxes given away.");
        
        
            
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int numberOfCarrotSticks = 74;
        int numberOfPeople = 12;
        int remainingUneatenCarrots = numberOfCarrotSticks % numberOfPeople;
        System.out.println("There were " + remainingUneatenCarrots + " carrots sticks left uneaten.");
        
        
        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int totalNumberOfTeddyBears = 98;
        int numberOfTeddyBearsPerShelf = 7;
        int numberOfShelvesFilled = totalNumberOfTeddyBears / numberOfTeddyBearsPerShelf;
        System.out.println("There will be " + numberOfShelvesFilled + " shelves filled.");
        
        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int totalOfPictures = 480;
        int picturesPerAlbum = 20;
        int totalOfPictureAlbums = totalOfPictures / picturesPerAlbum ;
        System.out.println("She will need " + totalOfPictureAlbums + " picture albumns.");
        
        
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int totalOFTradingCards = 94;
        int totalOfCardsPerBox = 8;
        int totalOfBoxesFilled = totalOFTradingCards / totalOfCardsPerBox;
        int numbersOfCardsRemaining = totalOFTradingCards % totalOfCardsPerBox;
        System.out.println(totalOfBoxesFilled + " boxes were filled, and " + numbersOfCardsRemaining +" cards were left.");
        
        
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int numberOfBooks = 210;
        int numberOfRepairedShelves = 10;
        int numberOfBooksPerShelf = numberOfBooks / numberOfRepairedShelves;
        System.out.println("Each shelf will contain " + numberOfBooksPerShelf + " books.");
        
        
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        int numberOfCroissantsCristinaBaked = 17;
        int numberOfCristinaGuests = 7;
        int numberOfCroissantsPerCristinaGuest = numberOfCroissantsCristinaBaked / numberOfCristinaGuests;
        System.out.println("Each guest will have " + numberOfCroissantsPerCristinaGuest + " croissants.");
        
        
	}

}
