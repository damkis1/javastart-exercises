package zadania.dziedziczenie.zadaniedwa;

class OnlineCourse extends Course {
    private int videoMinutes;
    private int completionTime;


    public int getVideoMinutes() {
        return videoMinutes;
    }

    public void setVideoMinutes(int videoMinutes) {
        this.videoMinutes = videoMinutes;
    }

    public int getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(int completionTime) {
        this.completionTime = completionTime;
    }

    @Override
    public String toString() {
        return super.toString() + "OnlineCourse{" +
                "videoMinutes=" + videoMinutes +
                ", completionTime=" + completionTime +
                '}';
    }
}
