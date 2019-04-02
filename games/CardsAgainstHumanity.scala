package games

import models._

val CardsAgainstHumanity = Ruleset(
  "Cards Against Humanity",
  "Someone plays a black card; everyone else plays a white card. The best white card wins",
  3,
  Added(Constant(2), NumberOfPlayers),
  Seq("white", "black"),
  MultiAction(
    TargetedAction(EveryPlayer(All), DrawsCardsUpTo(Constant(4), "white")),
    TargetedAction(TurnPlayer, DrawsCardsUpTo(Constant(1), "black")),
    TargetedAction(TurnPlayer, PlaysCards(Constant(1), "black")),
    TargetedAction(EveryPlayer(NonTurnPlayer), RespondsCards(Some("white"))),
    TargetedAction(TurnPlyaer, ChosesCards(Equals(1), Some("white"))),
    ConditionAction(EveryPlayer(NonTurnPlayer), HadCardChosen, GainPoints(Equals(1)), NoOpAction),
    ClearCardsAction(None)
  )
)

val WhiteCards = Deck(
  "Base Deck White Cards",
  Seq(
    Card("Being on Fire."),
    Card("Old-people smell."),
    Card("Boogers.")
  ),
  onCannotDraw=MultiAction(RefillFromDiscard(None), ShuffleDeckAction(None))
)

val BlackCards = Deck(
  "Base Deck Black Cards",
  Seq(
    Card("Why can't I sleep at night?", responseCards=1),
    Card("And the Academy Award for {{play}} goes to {{play1}}.", respondsCards=2),
    Card("What's that sound?", responseCards=1)
  ),
  onCannotDraw=MultiAction(RefillFromDiscard(None), ShuffleDeckAction(None))
)
