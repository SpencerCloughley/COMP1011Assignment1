package com.example.comp1011assignment1;

public class Match {
    private int gameId,gameDuration,seasonId,winner,firstBlood,firstTower,firstInhibitor,firstDragon,firstBaron,firstRiftHerald;
    //gameDuration is the int value of how many seconds into the game, must be at least 3 minutes long, and can go anytime past that
    //seasonId must be 1-13 as those are all the seasons of the game as of 2023(all the seasonId in this data is 9)
    //winner is either 1 or 2, team 1 or team 2, which correspond to blue team and red team respectively
    //firstBlood,firstTower,firstInhibitor,firstDragon,firstBaron,firstRiftHerald is 1,2 or 0, 1 or 2 for either team and 0 if it did not occur during the game
    // if the other team surrenders you can win a game without kills, towers etc, but each match must have a winner

    public Match(int gameId, int gameDuration, int seasonId, int winner, int firstBlood, int firstTower, int firstInhibitor, int firstDragon, int firstBaron, int firstRiftHerald) {
        setGameId(gameId);
        setGameDuration(gameDuration);
        setSeasonId(seasonId);
        setWinner(winner);
        setFirstBlood(firstBlood);
        setFirstTower(firstTower);
        setFirstInhibitor(firstInhibitor);
        setFirstDragon(firstDragon);
        setFirstBaron(firstBaron);
        setFirstRiftHerald(firstRiftHerald);
    }

    /**
     * @return returns the gameId
     */
    public int getGameId() {
        return gameId;
    }


    /**
     *
     * @param gameId the ID for the game stored in the database
     *               ensures its is >0
     */
    public void setGameId(int gameId) {
        if(gameId>0)
            this.gameId = gameId;
        else throw new IllegalArgumentException(gameId + " must be postive");
    }

    /**
     * @return returns the duration of the game in seconds as an integer
     */
    public int getGameDuration() {
        return gameDuration;
    }

    /**
     * @param gameDuration the time in seconds for how long the game went
     *                     must be over 3 minutes(180 seconds)
     */
    public void setGameDuration(int gameDuration) {
        if(gameDuration>180)
            this.gameDuration = gameDuration;
        else throw new IllegalArgumentException(gameDuration + " is not valid, must be over 3 minutes(180 seconds)");
    }

    /**
     * @return returns the season the match was played during
     */
    public int getSeasonId() {
        return seasonId;
    }

    /**
     * @param seasonId the number for which season the game was played on
     *                 must be from 1-13 as there have only been 13 seasons
     */
    public void setSeasonId(int seasonId) {
        if(seasonId>0 && seasonId<14)
            this.seasonId = seasonId;
        else throw new IllegalArgumentException(seasonId + " is invalid, must be from 1-13");
    }

    /**
     * @return returns which team won the game, 1 for blue side and 2 for red side
     */
    public int getWinner() {
        return winner;
    }

    /**
     * @param winner the winner of the game, 1 represents blue and 2 represents red
     *               must be either 1 or 2
     */
    public void setWinner(int winner) {
        if(winner==1 || winner==2)
            this.winner = winner;
        else throw new IllegalArgumentException(winner + " is invalid, must be either 1 or 2 for blue and red respectively");
    }

    /**
     * @return returns the team which got the first kill in the game as 1 for blue, 2 for red, or 0 if did not occur
     */
    public int getFirstBlood() {
        return firstBlood;
    }

    /**
     * @param firstBlood the team which got the first kill in the match
     *                   must be either 1 or 2 for teams or 0 for no kill recorded
     */
    public void setFirstBlood(int firstBlood) {
        if(firstBlood==1 || firstBlood==2 || firstBlood==0)
            this.firstBlood = firstBlood;
        else throw new IllegalArgumentException(firstBlood + " is invalid, must be either 1 or 2 for either team or 0 for no kills recorded");
    }

    /**
     * @return returns the team which got the first tower in the game as 1 for blue, 2 for red, or 0 if did not occur
     */
    public int getFirstTower() {
        return firstTower;
    }

    /**
     * @param firstTower the team which got the first tower demolished in the match
     *                   must be either 1 or 2 for teams or 0 for no tower demolished
     */
    public void setFirstTower(int firstTower) {
        if(firstTower==1 || firstTower==2 || firstTower==0)
            this.firstTower = firstTower;
        else throw new IllegalArgumentException(firstTower + " is invalid, must be either 1 or 2 for either team or 0 for no towers demolished");
    }

    /**
     * @return returns the team which got the first inhibitor in the game as 1 for blue, 2 for red, or 0 if did not occur
     */
    public int getFirstInhibitor() {
        return firstInhibitor;
    }

    /**
     * @param firstInhibitor the team which got the first inhibitor demolished in the match
     *                       must be either 1 or 2 for teams or 0 for no inhibitor demolished
     */
    public void setFirstInhibitor(int firstInhibitor) {
        if(firstInhibitor==1 || firstInhibitor==2 || firstInhibitor==0)
            this.firstInhibitor = firstInhibitor;
        else throw new IllegalArgumentException(firstInhibitor + " is invalid, must be either 1 or 2 for either team or 0 for no inhibitors demolished");
    }

    /**
     * @return returns the team which got the first dragon in the game as 1 for blue, 2 for red, or 0 if did not occur
     */
    public int getFirstDragon() {
        return firstDragon;
    }

    /**
     * @param firstDragon the team which got the first dragon killed in the match
     *                    must be either 1 or 2 for teams or 0 for no dragon killed
     *                    dragon does not spawn until 5 minutes so gameDuration must be <300 if 1 or 2
     */
    public void setFirstDragon(int firstDragon) {
        if(firstDragon==1 || firstDragon==2 || firstDragon==0) {
            if (firstDragon != 0 && gameDuration < 300)
                throw new IllegalArgumentException(firstDragon + " is invalid, dragon cannot be killed before 5 minutes into the game");
            else this.firstDragon=firstDragon;
        }
        else throw new IllegalArgumentException(firstDragon + " is invalid, must be either 1 or 2 for either team or 0 for no dragons killed");
    }
    /**
     * @return returns the team which got the first baron in the game as 1 for blue, 2 for red, or 0 if did not occur
     */
    public int getFirstBaron() {
        return firstBaron;
    }
    /**
     * @param firstBaron the team which got the first baron killed in the match
     *                    must be either 1 or 2 for teams or 0 for no baron killed
     *                    baron does not spawn until 20 minutes so gameDuration must be <1200 if 1 or 2
     */
    public void setFirstBaron(int firstBaron) {
        if(firstBaron==1 || firstBaron==2 || firstBaron==0) {
            if (firstBaron != 0 && gameDuration < 1200)
                throw new IllegalArgumentException(firstBaron + " is invalid, baron cannot be killed before 20 minutes into the game");
            else this.firstBaron = firstBaron;
        }
        else throw new IllegalArgumentException(firstBaron + " is invalid, must be either 1 or 2 for either team or 0 for no barons killed");
    }
    /**
     * @return returns the team which got the first rift herald in the game as 1 for blue, 2 for red, or 0 if did not occur
     */
    public int getFirstRiftHerald() {
        return firstRiftHerald;
    }
    /**
     * @param firstRiftHerald the team which got the first rift herald killed in the match
     *                        must be either 1 or 2 for teams or 0 for no rift herald killed
     *                        rift herald does not spawn until 8 minutes so gameDuration must be <1200 if 1 or 2
     */
    public void setFirstRiftHerald(int firstRiftHerald) {
        if(firstRiftHerald==1 || firstRiftHerald==2 || firstRiftHerald==0) {
            if (firstRiftHerald != 0 && gameDuration < 480)
                throw new IllegalArgumentException(firstRiftHerald + " is invalid, rift herald cannot be killed before 8 minutes into the game");
            else this.firstRiftHerald = firstRiftHerald;
        }
        else throw new IllegalArgumentException(firstRiftHerald + " is invalid, must be either 1 or 2 for either team or 0 for no heralds killed");
    }
}
