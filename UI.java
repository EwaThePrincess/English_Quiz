import javax.swing.*;
import java.util.Scanner;
import java.awt.Component;

public class UI {

    private static JRadioButton[] options = new JRadioButton[4];
    private static ButtonGroup group = new ButtonGroup();
    private static int currentQuestion = 0;
    private static int score = 0;
    private static String selected = null;
    String scoreText = Integer.toString(score);

    public static void main(String[] args) {
        Questions[] questions = new Questions[30];

        questions[0] = new Questions("1. Choose the correct word to complete the sentence: " +
                "\n The team is ________ for their poor performance last season.\n",
                "A) blame \n ",
                "B) blaming \n ",
                "C) to blamed \n ",
                "D) to blame \n", "D");
        questions[1] = new Questions("2. Choose the sentence that is grammatically correct:\n",
                "A) I have been working here since three years.\n",
                "B) I have worked here for three years.\n",
                "C) I am working here for three years.\n",
                "D) I work here for three years.", "B");
        questions[2] = new Questions("3. What is the correct phrasal verb to complete the sentence?\n" +
                "He finally ________ his exam after many attempts.\n",
                "A) passed away\n",
                "B) passed out\n",
                "C) passed over\n",
                "D) passed", "D");
        questions[3] = new Questions("4. Choose the correct word:\n" +
                "She is not ________ to make such decisions.\n",
                "A) enough experienced\n",
                "B) experience enough\n",
                "C) experienced enough\n",
                "D) enough experience", "C");
        questions[4] = new Questions("5. Complete the sentence:\n" +
                "I wish I ________ the answer to your question, but I don't.\n",
                "A) know\n",
                "B) knew\n",
                "C) will know\n",
                "D) had known", "B");
        questions[5] = new Questions("6. What does the idiom \"to spill the beans\" mean?\n",
                "A) To cook something badly\n",
                "B) To reveal a secret\n",
                "C) To clean up a mess\n",
                "D) To organize a meeting", "B");

        questions[6] = new Questions("7. Complete the sentence:\n " +
                "They _______ to the concert if they had known about it.\n",
                "A) would have gone \n ",
                "B) will go \n ",
                "C) go \n ",
                "D) had gone \n", "A");
        questions[7] = new Questions("8. What is the synonym of \"abandon\"?\n",
                "A) Keep\n",
                "B) Leave\n",
                "C) Support\n",
                "D) Save", "B");
        questions[8] = new Questions("9. Choose the correct word to complete the sentence:\n" +
                "This article is ________ for anyone who wants to learn about marketing strategies.\n",
                "A) useful\n",
                "B) use\n",
                "C) using\n",
                "D) used", "A");
        questions[9] = new Questions("10. Complete the sentence:\n" +
                "If I ________ the instructions more carefully, I would have done it correctly.\n",
                "A) follow\n",
                "B) followed\n",
                "C) had followed\n",
                "D) following", "C");
        questions[10] = new Questions("11. Choose the correct answer:\n" +
                "She’s been living in London ________ 2010.\n",
                "A) for\n",
                "B) since\n",
                "C) during\n",
                "D) by", "B");
        questions[11] = new Questions("12. Choose the correct sentence:\n",
                "A) I’m going to have to fix it later.\n",
                "B) I’m going fix it later.\n",
                "C) I have to fixing it later.\n",
                "D) I fix it later.", "A");
        questions[12] = new Questions("13. Which of the following sentences is in the passive voice?\n",
                "A) The teacher explains the lesson every day.\n",
                "B) The lesson is explained by the teacher every day.\n",
                "C) The teacher is explaining the lesson every day.\n",
                "D) The teacher explained the lesson yesterday.", "B");
        questions[13] = new Questions("14. Choose the correct word to complete the sentence:\n" +
                "I need to ________ my presentation before the meeting.\n",
                "A) revise\n",
                "B) review\n",
                "C) recheck\n",
                "D) all of the above", "D");
        questions[14] = new Questions("15. Which option is the correct condition for the sentence:\n" +
                "If she ________ the answer, she would have told me.\n",
                "A) knows\n",
                "B) know\n",
                "C) has known\n",
                "D) had known", "D");
        questions[15] = new Questions("16. Choose the best synonym for the word \"abundant\":\n",
                "A) Few\n",
                "B) Plentiful\n",
                "C) Rare\n",
                "D) Unavailable", "B");
        questions[16] = new Questions("17. Fill in the blank with the correct word:\n" +
                "His actions have been totally ________ to his cause.\n",
                "A) unrelated\n",
                "B) important\n",
                "C) related\n",
                "D) irrelevant", "A");
        questions[17] = new Questions("18. Choose the correct sentence:\n",
                "A) There’s too much people in the room.\n",
                "B) There’s too many people in the room.\n",
                "C) There’re too much people in the room.\n",
                "D) There’s too much people in the room.", "B");
        questions[18] = new Questions("19. Which of the following sentences uses a past perfect form?\n",
                "A) I have never seen that movie.\n",
                "B) I had already left when she called.\n",
                "C) I was going to the store.\n",
                "D) I saw that movie last week.", "B");
        questions[19] = new Questions("20. Which is the correct form of the word in brackets?\n" +
                "She was really ________ when she heard the news. (surprise)\n",
                "A) surprise\n",
                "B) surprising\n",
                "C) surprised\n",
                "D) surprisingly", "C");
        questions[20] = new Questions("21. Identify the correct sentence:\n",
                "A) He don’t like spinach. \n ",
                "B) He doesn’t likes spinach. \n ",
                "C) He doesn’t like spinach. \n ",
                "D) He not like spinach. \n", "C");
        questions[21] = new Questions("22. Choose the correct form:\n If I _______ enough money, I would travel the world.\n",
                "A) have \n ",
                "B) had \n ",
                "C) will have \n ",
                "D) has \n", "B");
        questions[22] = new Questions("23. Pick the correct preposition:\n She’s interested _______ learning French.\n",
                "A) at \n ",
                "B) for \n ",
                "C) in \n ",
                "D) to \n", "C");
        questions[23] = new Questions("24. Choose the correct sentence:\n",
                "A) I am studying English since five years. \n ",
                "B) I have been studying English for five years. \n ",
                "C) I study English from five years. \n ",
                "D) I had study English since five years. \n", "B");
        questions[24] = new Questions("25. Select the correct article:\n She bought _______ umbrella because it was raining.\n",
                "A) an \n ",
                "B) a \n ",
                "C) the \n ",
                "D) none \n", "A");
        questions[25] = new Questions("26. Choose the best option to complete the sentence:\n John is taller _______ Peter.\n",
                "A) then \n ",
                "B) than \n ",
                "C) that \n ",
                "D) from \n", "B");
        questions[26] = new Questions("27. Which sentence is grammatically correct?\n",
                "A) We was going to the market. \n ",
                "B) We are go to the market. \n ",
                "C) We went to the market. \n ",
                "D) We gone to the market. \n", "C");
        questions[27] = new Questions("28. Choose the correct verb form:\n She _______ her homework before dinner.\n",
                "A) finish \n ",
                "B) finished \n ",
                "C) finishing \n ",
                "D) finishes \n", "B");
        questions[28] = new Questions("29. Select the correct word to complete the sentence:\n" +
                "She was so tired that she could hardly keep her eyes _______.\n",
                "A) open \n ",
                "B) shut \n ",
                "C) oppened \n ",
                "D) shutted \n", "A");
        questions[29] = new Questions("30. Choose the correct phrase:\n I’ll call you as soon as I _______ home.\n",
                "A) will get \n ",
                "B) got \n ",
                "C) get \n ",
                "D) gets \n", "C");

        JFrame frame = new JFrame("English Quiz");
        frame.setSize(800, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Welcome to the EnglishQuiz!");
        JButton startButton = new JButton("Start English test");
        JButton finishButton = new JButton("Finish");
        JLabel scoreLabel = new JLabel();

        JLabel questionLabel = new JLabel();
        JButton nextButton = new JButton("Next");



        panel.add(label);
        panel.add(startButton);
        panel.add(finishButton);
        panel.add(scoreLabel);
        scoreLabel.setVisible(false);
        finishButton.setVisible(false);

        panel.add(nextButton);
        panel.add(questionLabel);

        questionLabel.setVisible(false);
        nextButton.setVisible(false);
        questionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        finishButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        finishButton.setVisible(false);
        frame.add(panel);
        frame.setVisible(true);

        startButton.addActionListener(e -> {
            startButton.setVisible(false);
            label.setVisible(false);
            currentQuestion=0;

            Questions q = questions[currentQuestion];

            questionLabel.setText(q.getQuestion());
            questionLabel.setVisible(true);

            for (int i = 0; i < 4; i++) {
                options[i] = new JRadioButton();
                group.add(options[i]);
                panel.add(options[i]);
                options[i].setAlignmentX(Component.CENTER_ALIGNMENT);
            }

            options[0].setText(q.getOptionA());
            options[1].setText(q.getOptionB());
            options[2].setText(q.getOptionC());
            options[3].setText(q.getOptionD());

            nextButton.setVisible(true);

        });
            nextButton.addActionListener(f -> {

                if (options[0].isSelected()) selected = "A";
                else if (options[1].isSelected()) selected = "B";
                else if (options[2].isSelected()) selected = "C";
                else if (options[3].isSelected()) selected = "D";
                if (selected != null && selected.equals(questions[currentQuestion].getAnswer())) {
                    score++;
                    scoreLabel.setText("Your score is: " + score);

                    scoreLabel.setVisible(true);
                }
                group.clearSelection();
                currentQuestion++;
                selected=null;

                for (int i = currentQuestion; i < questions.length; i++) {
                    if (i < questions.length) {
                        Questions q = questions[currentQuestion];
                        questionLabel.setText(q.getQuestion());
                        options[0].setText(q.getOptionA());
                        options[1].setText(q.getOptionB());
                        options[2].setText(q.getOptionC());
                        options[3].setText(q.getOptionD());
                    }
                }
                if (currentQuestion == questions.length) {
                    nextButton.setVisible(false);
                    finishButton.setVisible(true);
                    Questions q = questions[currentQuestion];
                    questionLabel.setText(q.getQuestion());
                    options[0].setText(q.getOptionA());
                    options[1].setText(q.getOptionB());
                    options[2].setText(q.getOptionC());
                    options[3].setText(q.getOptionD());
                }

                scoreLabel.setText("Your score is: " + score);
                scoreLabel.setVisible(true);
                if (currentQuestion == questions.length-1) {
                    nextButton.setVisible(false);
                    finishButton.setVisible(true);
                }
                });


        finishButton.addActionListener(f -> {
            if (options[0].isSelected()) selected = "A";
            else if (options[1].isSelected()) selected = "B";
            else if (options[2].isSelected()) selected = "C";
            else if (options[3].isSelected()) selected = "D";
            if (selected != null && selected.equals(questions[currentQuestion].getAnswer())) {
                score++;
                scoreLabel.setVisible(true);
            }
            group.clearSelection();
            finishButton.setVisible(false);
            scoreLabel.setVisible(false);
            for (JRadioButton opt : options) opt.setVisible(false);
            questionLabel.setText("Your score: " + score + "/30");
            startButton.setVisible(true);
            startButton.setText("Try again");
            if (score>=28){
                label.setVisible(true);
                label.setText("Excellent!");
            } else if (score>=25) {
                label.setVisible(true);
                label.setText("Well done!");
            } else if (score>=15) {
                label.setVisible(true);
                label.setText("Not bad!");
            }

        });

    }
}
