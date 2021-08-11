package org.enthuware.genericsAndCollections._01;

public class Test01 {

}


class Game{}
class Cricket extends Game{}
class Instrument{}
class Guitar extends Instrument{}

interface Player<E>{ void play(E e); }
interface GamePlayer<E extends Game> extends Player<E>{}
interface MusicPlayer<E extends Instrument> extends Player{}


/*
class Batsman implements GamePlayer<Cricket>{
	@Override
	public void play(Game o) {}
}
*/

/*
class Bowler implements GamePlayer<Guitar>{
	public void play(Guitar o) {}
}
*/


/*
class Bowler implements Player<Guitar>{

	@Override
	public void play(Guitar e) {}
	
}
*/


/*
class MidiPlayer implements MusicPlayer{

	@Override
	public void play(Guitar e) {}
	
}
*/