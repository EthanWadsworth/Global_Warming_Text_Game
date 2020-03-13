class Text {
  // class to hold character dialogue and in-game text

  // dialogue for start screen
  public static final String INSTRUCTIONS = "HOW TO PLAY:\n\n" +
                                            "1. Make your decisions by using"+
                                            " the mouse and clicking on the" +
                                            "  desired option to lock in your "+
                                            "decision!\n" +
                                            "2. Pay attention to the events" +
                                            " occurring in the game. They " +
                                            "effect the outcome, so your " +
                                            "decisions matter!\n" +
                                            "3. Do you see that panel at the " +
                                            "top of your screen? Pay attention" +
                                            "to your finances, as that determine" +
                                            " if you can continue to provide for" +
                                            " your family. Equally as important" +
                                            " is the Planet HP. Don't let that" +
                                            " drop to zero, or else the factories" +
                                            " have succeeded in sucking the planet" +
                                            "dry of all life on Shadgon.\n" +
                                            "4. Most important: Have fun and enjoy!";

  // text for welcoming player
  public static final String WELCOME = "Welcome to Shadgon, a planet very " +
                                       "similar to Earth! On this planet, " +
                                       "you live with your spouse, %s, and your" +
                                       " child, %s. You live in a standard " +
                                       "suburban neighborhood near one of the" +
                                       " many green oceans on Shadgon. Your community " +
                                       "depends on local fish and food grown throughout" +
                                       " the surrounding region to survive. " +
                                       "However, this planet is doomed to an ill fate" +
                                       " in the near future unless events in the present" +
                                       " can be changed. The power and manufacturing corporation" +
                                       " Exios has created a monopoly over supplying power to" +
                                       " the entire planet by draining the life energy, Natura directly from the planet's core, making large sums of money in " +
                                       " the process. Without Natura breathing life into Shadgon, " +
                                       " all greenery with cease to grow, and the planet will" +
                                       " quickly become a desolate wasteland. Exios factories are" +
                                       " speeding up the doomsday timer by spewing out gases into the air" +
                                       " that are warming the planet and making it more difficult to sustain life" +
                                       " on the surface.\n\n Quickly! You must band together" +
                                       " with your fellow citizens and act together to save the planet!";

  public static final String GAME_TITLE = "A CAUTIONARY TALE";

  public static final String EMPTY_STR = "";

  // Button options
  public static final String START= "START";
  public static final String CONTINUE = "CONTINUE";
  // for buttons and in game text
  public static final String NO = "NO";
  public static final String YES = "YES";

  public static final String GWARMINGQ = "You hear a knock on your door. " +
                                           "Upon opening it, you find that it" +
                                           " is your neighbor %s.\n\n" +
                                           "%s: Hey have you heard what the " +
                                           "local power factories are doing to the " +
                                           "planet? Have " +
                                           "you also heard about this phenomenon " +
                                           "called global warming!?";

  //TODO finish
  public static final String GWARMINGANSY = "%s: So you know how global warming " +
                                            "is putting our entire planet in" +
                                            "danger through general global " +
                                            "temperature increases, and how " +
                                            "the local power factories and factories" +
                                            "across this planet are literally " +
                                            " draining the life force" +
                                            ", out of the planet. All life on Shadgon " +
                                            " is slowly dying because of what" +
                                            "they are doing, as the planet can no " +
                                            "longer provide all plants and animals with life " +
                                            "energy. And for what? Just so we can power our homes and" +
                                            " devices? We are part of the problem as well! Not to mention that the" +
                                            " factories are the one's spewing " +
                                            "those heat trapping gases into the air." +
                                            "Something needs to be done " +
                                            "now or else there won't be any planet left soon!" +
                                            "\n\nYou: How do we know for sure that " +
                                            "these power plants are actually doing this," +
                                            " and that we as a species are responsible?\n\n" +
                                            "%s: Don't you get it! Your whole family" +
                                            " is in immediate danger! Look around you!" +
                                            " You've seen the sea level rising and slowly" +
                                            " encroaching on our town! You've probably" +
                                            " also noticed that food from local markets" +
                                            " has also gotten much more expensive" +
                                            " because farmer's are finding it more difficult" +
                                            " to grow food! Just think on it.\n\n" +
                                            "(%s turns and walks away)\n\n You still" +
                                            " aren't sure of everything your neighbor" +
                                            " told you, but the thought of your family" +
                                            " being in immediate danger has left you " +
                                            "thinking.\n\n Are you concerned?";

  public static final String GWARMINGANSNO = "%s: You don't know what's going on!?" +
                                             " Okay, well global warming is the phenomenon " +
                                             "where these gases commonly referred " +
                                             "to as greenhouse gases trap heat" +
                                             " in the atmosphere and gradually warm" +
                                             " the planet, making it more difficult" +
                                             " for all species on this planet to survive." +
                                             " All of our planet is in danger " +
                                             "because these power factories like the one" +
                                             " right outside our community are draining " +
                                             "the literal life energy,  Natura, out of " +
                                             "it. With no life energy, this planet" +
                                             " will dry up. Nothing will grow, nothing" +
                                             " will survive. We are contributing to " +
                                             "the problem by allowing these power factories" +
                                             " to sucker us into buying power only from" +
                                             "them. Something needs to be done now or else" +
                                             " there won't be any planet left soon!\n\n" +
                                             "You: How do we know for sure that " +
                                             "these power plants are actually doing this," +
                                             " and that we as a species are responsible?\n\n" +
                                             "%s: Don't you get it! Your whole family" +
                                             " is in immediate danger! Look around you!" +
                                             " You've seen the sea level rising and slowly" +
                                             " encroaching on our town! You've probably" +
                                             " also noticed that food from local markets" +
                                             " has also gotten much more expensive" +
                                             " because farmer's are finding it more difficult" +
                                             " to grow food! Just think on it.\n\n" +
                                             "(%s turns and walks away)\n\n You still" +
                                             " aren't sure of everything your neighbor" +
                                             " told you, but the thought of your family" +
                                             " being in immediate danger has left you " +
                                             "thinking.\n\n Are you concerned?";

  // Initial question to ask user
  public static final String CONCERNEDQ = "Do you want to act?";

  /*********************** Messages for ruin path ***********************/

  // first food increase - 1st ruin screen
  public static final String FOOD_INCREASE = "The price of food increases after one year, " +
                                             "and you have noticed that " +
                                             "you have had to start cutting " +
                                             "meals and rationing food due to" +
                                             " the increasing failure of crops from heat, lack of crop growth" +
                                             " and the increase in food prices." +
                                             "While conditions are still manageable, " +
                                             "you can't help but worry about the " +
                                             "near future. What will happen to my family" +
                                             " is these coniditions to get more extreme?" +
                                             "\n\n You think back to what %s told" +
                                             " you all that time ago. \n\n Do" +
                                             " get involved or further involved? What will happen" +
                                             " to your family if you don't?)";

  // second ruin screen - food price continues to increase
  public static final String RUIN_TWO = "Local farmers are now complaining that " +
                                        " food is no longer growing in soil " +
                                        "that used to be fertile. Many are leaving to try growing elewhere." +
                                        "Many fisherman have also become largely" +
                                        " unsuccessful at catching fish due to the" +
                                        " fish swmming deeper and away from the coast " +
                                        " for cooler waters." +
                                        "You think back to " +
                                        "what %s told you all those years ago." +
                                        " Your family can barely afford food, and" +
                                        " basic necessities. \n\n %s Holds %s weakly in their arms\n\n" +
                                        " %s: Are we going to be okay?\n\n" +
                                        "Do you decide to act or take a more active role " +
                                        "for not only the fate of the planet, but" +
                                        "for your own family?";

  // third ruin screen - forcing the family to relocate TODO implement
  public static final String RUIN_THREE = "As the living conditions continue to" +
                                          " get worse, you are worried that your" +
                                          " family will not survive much longer. " +
                                          "You are also worried that you might be" +
                                          " forced to relocate due to rising sea levels" +
                                          " encroaching on your seaside town. Many of" +
                                          " your old neighbors have already abandoned" +
                                          " their homes, and several people have died" +
                                          " due to the extreme conditions. Your family grows weaker by the day. It's now" +
                                          " or never:\n\nDo you decide to act and try" +
                                          " to save the planet before it's too late," +
                                          " or do you remain complacent and think that you have done enough?";

  /*************************** Messages for Preservation Paths ************/
  public static final String MAIN_PRESERVE_MSG = "You have chosen to act and make " +
                                                 "an effort to save the planet! You notice" +
                                                 " that a lot of people in your community" +
                                                 " have signs in front of their homes" +
                                                 " for the local environmental social movement" +
                                                 " advocating for the government to regulate" +
                                                 " and remove the power generation parasite that is" +
                                                 " Exios from" +
                                                 " the surface of Shadgon. You also" +
                                                 " notice that your neighbors are starting" +
                                                 " put up solar panels on their homes" +
                                                 " and many others have expressed plans " +
                                                 " to add them. Influenced by what you see," +
                                                 " you decide to implement at least one" +
                                                 " of these solutions.\n\n Which will it be?";

  //TODO put in monetary value for solar panels
  public static final String TO_POOR = "You currently do not have enough money " +
                                       "to pay for solar panels. Solar panels cost 30000. Try to make a difference" +
                                       " in some other ways until you have enough!";

  public static final String SOLAR = "SOLAR";
  public static final String SOCIAL = "SOCIAL";

  public static final String IMPLEMENT_SOLAR = "Great decision! Joining you neighbors" +
                                               " in adding solar panels to your home" +
                                               " has positively influenced even more " +
                                               "to do the same. Even though it cost" +
                                               " a lot of your much needed money, " +
                                               " you feel like the needs of your" +
                                               " family are directly related to" +
                                               " the needs of the planet, and have" +
                                               " acted accordingly. You have also " +
                                               " slowed down the death of Shadgon by helping decrease "+
                                               " community energy usage. You hear news that people across the planet" +
                                               " are following the lead of small communities like yours. \n\n By implementing" +
                                               " solar, do you think that you have completely done" +
                                               " your part to preserve the planet for future generations?";

  public static final String JOIN_SOCIAL = " SFS Lead Committee Member: Welcome to the the environmental movement" +
                                           " Stand for Shadgon! We have varying levels of " +
                                           " involvement in our organization! For newcomers " +
                                           " and those who don't want to get too involved, you" +
                                           " can vote on another upcoming environmental bill" +
                                           " that would further limit the amount of life energy" +
                                           " that Exios can suck" +
                                           " out per day and sign a petition to get the " +
                                           " the government to understand just how much damage" +
                                           " their power factories are doing to our planet. For" +
                                           " those who want some more involvement, we have another" +
                                           " upcoming peaceful protest in front of" +
                                           " the local government building to pressure" +
                                           " the government into limiting the number of power harvesters " +
                                           " Exios can have running at one time, and the " +
                                           " rate at which these companies can extract life energy for power." +
                                           " \n\n Which will it be?";

  public static final String VOTE = "VOTE";
  public static final String GO_PROTEST = "PROTEST";

  public static final String PETITION = " You showed up on voting day and voted" +
                                        " in favor of the environmental bill in question being" +
                                        " decided upon. You also sign the petition " +
                                        " to pressure the government into investigating" +
                                        " the activities of these large power factories and companies." +
                                        " Doing this makes you feel like you are standing up " +
                                        " for the future of your family and most especially for" +
                                        "%s. You feel like you could possibly become more involved after" +
                                        " letting your voice be heard. \n\n The choice is yours. " +
                                        " Do you want to implement another solution?";

  public static final String PROTEST = "(The Day of the Protest)\n\n " +
                                       "SFS Lead Committee Member: Hello thank you so much" +
                                       " for choosing to join us in today's strike! We're here" +
                                       " today to pressure the government into taking actions" +
                                       " towards regulating these power corporations and " +
                                       "exposing them to the wider public.\n\n" +
                                       " You grab one of the signs lying on the ground, " +
                                       "and rush to join the other members wanting to get" +
                                       " their voices heard. When you begin to chant with them," +
                                       "you realize that it's not your just your voice, but also" +
                                       " the voice of your family and the voice of the planet streaming" +
                                       " through you. As you yell, you begin to see how " +
                                       " your individual actions can connect to a much larger" +
                                       " movement.\n\n (Days after the Protest)\n\n" +
                                       " You receive word that protests across the planet" +
                                       " has forced many governments to put new regulations" +
                                       " on the large power companies, slowing the rate of the" +
                                       " degredation of Shadgon. Congrats!\n\n You feel a sense of " +
                                       "accomplishment for your contributions. Would you like to " +
                                       " perform another action to help save Shadgon, or " +
                                       " do you feel like this action is enough, and that " +
                                       " you do not have to contribute any more?";
  /*************************** Endings **********************************/

  public static final String NEUTRAL_END = "Fifteen years later...\n\nWhile the people of Shadgon tried" +
                                           " to pressure the government and become" +
                                           " independent from the Exios power factories," +
                                           " it was far too late. While the end was" +
                                           " delayed, change came far too slow. Everyone that" +
                                           " had the money left for another home offworld. The others" +
                                           " died trying to save their own families. The power factory" +
                                           " executives have left with their profits," +
                                           " leaving for another world to suck dry." +
                                           " As you sit by your spouse's and child's" +
                                           " grave in the town graveyard, you finish" +
                                           " up writing your account of the events" +
                                           " that transpired in the hopes that " +
                                           "someone finds this and can use it as a source to educate future generations to prevent these" +
                                           " mistakes that were made before it happens" +
                                           " to them as well. Finishing up the " +
                                           "acknowledgements, you write:\n\nFor" +
                                           " my spouse %s, and my child %s. You close" +
                                           " this obituary for the planet of Shadgon and" +
                                           " look at the title: A Cautionary Tale\n\nEND";

  public static final String GOOD_END = "Ten years later...\n\n With your help" +
                                        " and with the help of the people of Shadgon," +
                                        " all power factories were shut down in " +
                                        "favor of more eco-friendly renewable" +
                                        " energy sources. The government was pressured" +
                                        " into implementing policies that rebuild" +
                                        " the ecosystems that were destroyed and" +
                                        " preserve the planet's health until " +
                                        "it returns to full health. Sitting back" +
                                        " with your family on the front lawn, you" +
                                        " finally have a moment to reflect on how" +
                                        " you, a single individual, decided to" +
                                        " take action and become part of something" +
                                        " bigger for the sake of your family and" +
                                        " other families across the planet. \n\nEND";

  public static final String BAD_END = "Ten years later...\n\n With minimal efforts " +
                                       "made to stop the power factories from draining Shadgon's" +
                                       " life energy and heating the planet, Shadgon quickly became" +
                                       " devoid of all life. Everyone that" +
                                       " had the money left for another home offworld. The others" +
                                       " died trying to save their own families." +
                                       " In a local graveyard lie your remains," +
                                       " alongside those of your family. On your" +
                                       " headstone rests a handwritten journal. Inside it" +
                                       " lies an obituary for the planet of Shadgon and" +
                                       " a description of the events that happened here to " +
                                       " educate future generations on other planets who" +
                                       " may come across it in the hopes that they" +
                                       " read it and prevent the mistakes made here " +
                                       "from happening on their own world. The cover" +
                                       " reads: A Cautonary Tale. \n\n END" ;
}
