package propia;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class Piano implements Instrumento {
    private int volume;
    private final Synthesizer sintetizador;
    public Piano() throws MidiUnavailableException {
        sintetizador = MidiSystem.getSynthesizer();
    }
    @Override
    public void tocar(Melodia melodia) {
        try {
            sintetizador.open();
            MidiChannel canal = sintetizador.getChannels()[0];
            canal.programChange(1);//código ID do piano
            melodia.musica(canal, volume);
            sintetizador.close();
        }catch (MidiUnavailableException ex) {
            System.out.println(ex);
            sintetizador.close();
        }
    }
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
