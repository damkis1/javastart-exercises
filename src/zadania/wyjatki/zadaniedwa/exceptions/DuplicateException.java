package zadania.wyjatki.zadaniedwa.exceptions;

import zadania.wyjatki.zadaniedwa.Participant;

public class DuplicateException extends RuntimeException{
    private final Participant participant;

    public DuplicateException(Participant participant) {
        this.participant = participant;
    }

    public Participant getParticipant() {
        return participant;
    }
}
