import java.util.Scanner;

public class BookGenreSelection {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Consume the newline character left in the buffer
        scanner.nextLine();

        // Variable to track if a valid book genre has been selected
        boolean validGenreSelected = false;

        // Variable to store the selected genre
        String selectedGenre = "";

        // Loop until a valid book genre is selected
        while (!validGenreSelected) {
            // Prompt the user to choose a number for the book genre
            System.out.println("\nChoose a number from 1 to 11 for the book genre:");
            System.out.println("\n1. Fantasy Fiction");
            System.out.println("2. Historical Fiction");
            System.out.println("3. Thriller/Horror");
            System.out.println("4. Non-Fiction");
            System.out.println("5. Comic Books");
            System.out.println("6. Self-Help");
            System.out.println("7. Young Adult");
            System.out.println("8. Manga");
            System.out.println("9. Mystery");
            System.out.println("10. Cook Books");
            System.out.println("11. Smut");

            // Get the user's choice for the book genre
            System.out.print("\nEnter your choice: ");
            int genreChoice = scanner.nextInt();

            // Consume the newline character left in the buffer
            scanner.nextLine();

            // Determine the selected genre based on the user's choice
            switch (genreChoice) {
                case 1:
                    selectedGenre = "Fantasy Fiction";
                    validGenreSelected = true;
                    break;
                case 2:
                    selectedGenre = "Historical Fiction";
                    validGenreSelected = true;
                    break;
                case 3:
                    selectedGenre = "Thriller/Horror";
                    validGenreSelected = true;
                    break;
                case 4:
                    selectedGenre = "Non-Fiction";
                    validGenreSelected = true;
                    break;
                case 5:
                    selectedGenre = "Comic Books";
                    validGenreSelected = true;
                    break;
                case 6:
                    selectedGenre = "Self-Help";
                    validGenreSelected = true;
                    break;
                case 7:
                    selectedGenre = "Young Adult";
                    validGenreSelected = true;
                    break;
                case 8:
                    selectedGenre = "Manga";
                    validGenreSelected = true;
                    break;
                case 9:
                    selectedGenre = "Mystery";
                    validGenreSelected = true;
                    break;
                case 10:
                    selectedGenre = "Cook Books";
                    validGenreSelected = true;
                    break;
                case 11:
                    selectedGenre = "Smut";
                    validGenreSelected = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid number.");
            }
        }

        // Display the user's information and selected book genre
        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Selected Book Genre: " + selectedGenre);

        // Call the recommendBooks method with the selected genre
        recommendBooks(selectedGenre);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }

    // Method to recommend books based on the selected genre
    private static void recommendBooks(String genre) {
        System.out.println("\nRecommended Books for " + genre + ":");
        switch (genre) {
            case "Fantasy Fiction":
                System.out.println("\n1. Game of Thrones by George Martin");
                System.out.println("2. The Hobbit by John Tolkien");
                System.out.println("3. Be sure by Seanan McGuire");
                System.out.println("4. The eye of the world by Robert Jordan");
                System.out.println("5. Witch King by Martha Wells");

                System.out.print("\nWould you like a summary of the books given? Enter Y for Yes or N for No: ");
                String userAnswer1 = scanner.nextLine();
                if ("Y".equalsIgnoreCase(userAnswer1)) {
                    System.out.println("\n1. Game of Thrones by George Martin");
                    System.out.println("  ~ Is the first book in George R.R. Martin's A Song of Ice and Fire series. \nSet in the fictional land of Westeros, it follows the power struggles among noble families as they vie for the Iron Throne.\nThe story is marked by political intrigue, complex characters, and a looming threat from the White Walkers in the North, \nmaking it a captivating and unpredictable tale of treachery and ambition.");
                    System.out.println("\n2. The Hobbit by John Tolkien");
                    System.out.println("   ~ Is an adventurous tale of a hobbit named Bilbo Baggins who is unexpectedly thrust into a quest to reclaim a treasure guarded by the dragon Smaug. \nAccompanied by a group of dwarves and guided by the wizard Gandalf, Bilbo faces numerous challenges, including encounters with trolls, goblins, and \na fateful riddle game with Gollum. Through his journey, Bilbo discovers courage and resourcefulness he never knew he possessed, \ntransforming from a timid homebody into a hero.");
                    System.out.println("\n3. Be sure by Seanan McGuire");
                    System.out.println("   ~ In this story, the protagonist, Annie, grapples with the implications of her psychic abilities and her family's involvement in the world of monsters. \nAs she navigates her supernatural heritage and secrets, Annie must make difficult choices that \ncould have far-reaching consequences for her family and the cryptid community.");
                    System.out.println("\n4. The eye of the world by Robert Jordan");
                    System.out.println("   ~ Is the first book in the epic fantasy series, The Wheel of Time. \nIt follows the journey of three young friends, Rand, Mat, and Perrin, who become embroiled in a grand adventure when their peaceful village is attacked by dark forces. \nAs they flee for their lives, they discover that they are part of a prophecy that may hold the key to saving the world from an ancient evil. \nThe book sets the stage for a sprawling and intricate fantasy tale, filled with magic, \npolitical intrigue, and a richly developed world.");
                    System.out.println("\n5. Witch King by Martha Wells");
                    System.out.println("   ~ Is the second installment in the Ghosts of Rith series. \nIn this fantasy novel, we follow the story of the newly crowned Witch King, Khatrimantz, as he faces the challenges and responsibilities of his new role while navigating \npolitical intrigue, powerful enemies, and the legacy of his predecessor. As the new ruler, Khatrimantz must make \ndifficult choices to protect his kingdom and establish his reign.");
                }
                break;

            case "Historical Fiction":
                System.out.println("1. The Duke and I (Bridgerton Series #1) by Julia Quinn");
                System.out.println("2. The book thief by Markis Zusak");
                System.out.println("3. Stone blind by Natalie Haynes");
                System.out.println("4. The world and all that it holds by Aleksander hemon");
                System.out.println("5. The armor of light by Ken Follett");

                System.out.print("\nWould you like a summary of the books given? Yes or No: ");
                String userAnswer2 = scanner.nextLine();
                if ("Yes".equalsIgnoreCase(userAnswer2)) {
                    System.out.println("\n1. The Duke and I (Bridgerton Series #1) by Julia Quinn");
                    System.out.println("   ~ Is the first book in the Bridgerton series, a historical romance set in Regency-era London. It tells the story of Daphne Bridgerton and Simon Basset, \nthe Duke of Hastings. Daphne and Simon enter into a fake courtship to navigate the pressures of society, but their mutual \nattraction and growing feelings complicate their arrangement, leading to a passionate and tumultuous love story. \nThe novel combines wit, humor, and the intricacies of high society, making it a delightful and captivating romance read.");
                    System.out.println("\n2. The book thief by Markis Zusak");
                    System.out.println("   ~ Is a haunting and moving novel set in Nazi Germany during World War II. It is narrated by Death and follows the life of Liesel Meminger, a young girl living \nwith foster parents, as she discovers the power of words and books. The story beautifully explores the themes of love, \nhumanity, and resilience in the face of one of history's darkest periods, making it a poignant and unforgettable tale.");
                    System.out.println("\n3. Stone blind by Natalie Haynes");
                    System.out.println("   ~ The only mortal in a family of gods, Medusa is the youngest of the Gorgon sisters. Unlike her siblings, Medusa grows older, experiences change, feels weakness. \nHer mortal lifespan gives her an urgency that her family will never know. When the sea god Poseidon assaults Medusa in Athene's temple, the goddess is enraged.");
                    System.out.println("\n4. The Sparrow by Mary Doria Russell");
                    System.out.println("   ~ Is a thought-provoking science fiction novel that explores the first contact between humans and an alien civilization. A team of scientists, including a \nJesuit priest, travels to a distant planet to make contact with the enigmatic extraterrestrial species. As they encounter the \ncomplexities of interstellar travel, faith, and cultural misunderstandings, the story delves into profound \nethical and philosophical questions, making it a gripping and contemplative exploration of the human condition.");
                    System.out.println("\n5. The armor of light by Ken Follett");
                    System.out.println("   ~ A world filled with unrest wrestles for control over this new world order: A mother's husband is killed in a work accident due to negligence; \na young woman fights to fund her school for impoverished children; a well-intentioned young man unexpectedly inherits a failing business; \none man ruthlessly protects his wealth");
                }
                break;
            case "Thriller/Horror":
                System.out.println("1. Salem's lot by Stephen King");
                System.out.println("2. The Shining by Stephen King");
                System.out.println("3. Haunted by Chuck Palahniuk");
                System.out.println("4. Our share of night by Mariana Enriquez");
                System.out.println("5. Ghost story by Peter Straub");

                System.out.print("\nWould you like a summary of the books given? Yes or No: ");
                String userAnswer3 = scanner.nextLine();
                if ("Yes".equalsIgnoreCase(userAnswer3)) {
                    System.out.println("\n1. Salem's lot by Stephen King");
                    System.out.println("   ~ Is a classic horror novel that tells the story of a writer, Ben Mears, who returns to the small town of Jerusalem's Lot (Salem's Lot) in \nMaine to confront his childhood fears. However, he soon realizes that the town has been plagued by a vampire infestation, \nand he must join forces with a small group of residents to combat the growing evil. The book masterfully combines elements of traditional \nvampire lore with King's signature storytelling to create a chilling and suspenseful tale of terror, loss, and the battle between good and evil.");
                    System.out.println("\n2. The Shining by Stephen King");
                    System.out.println("   ~ s a psychological horror novel that follows Jack Torrance, a recovering alcoholic and aspiring writer, who becomes the winter caretaker of \nthe remote Overlook Hotel. He moves in with his wife, Wendy, and their young son, Danny, who possesses psychic abilities \nreferred to as the shining. As the winter progresses and the hotel becomes isolated, supernatural events and the hotel's malevolent influence \nlead to a descent into madness for Jack, endangering his family and revealing the sinister history of the Overlook Hotel.");
                    System.out.println("\n3. Haunted by Chuck Palahniuk");
                    System.out.println("   ~ s a darkly satirical and disturbing novel that follows a group of aspiring writers who voluntarily check into an isolated artist's retreat \nto find inspiration. However, their pursuit of creativity takes a sinister turn as they face physical and psychological \nhorrors within the retreat's walls. Through a series of interconnected short stories, the book explores the human desire for fame, the macabre, \nand the lengths people will go to in the name of art, all while offering a scathing commentary on modern culture.");
                    System.out.println("\n4. Our share of night by Mariana Enriquez");
                    System.out.println("   ~ A young father and son set out on a road trip, devastated by the death of the wife and mother they both loved. United in grief, the pair \ntravel to her ancestral home, where they must confront the terrifying legacy she has bequeathed: a family called the Order that \ncommits unspeakable acts in search of immortality.");
                    System.out.println("\n5. Ghost story by Peter Straub");
                    System.out.println("   ~ Is a horror novel that tells the tale of a group of elderly friends in the small town of Milburn, who have kept a dark secret for over 50 years. \n As they face a series of supernatural and horrifying events, they come to realize that a malevolent force from their past is seeking revenge. \nThe book is a chilling exploration of guilt, memory, and the consequences of actions taken in one's youth, delivering a \nsuspenseful and terrifying narrative that blurs the lines between reality and the supernatural.");

                }
                break;
            case "Non-Fiction":
                System.out.println("1. The Sixth Extinction by Elizabeth Kolbert");
                System.out.println("2. The year of Magical Thinking");
                System.out.println("3. No Logo by Naomi Klein");
                System.out.println("4. Birthday Letters by Ted Hughes");
                System.out.println("5. Dreams from my Father by Barack Obama");

                System.out.print("\nWould you like a summary of the books given? Yes or No: ");
                String userAnswer4 = scanner.nextLine();
                if ("Yes".equalsIgnoreCase(userAnswer4)) {
                    System.out.println("\n1. The Sixth Extinction by Elizabeth Kolbert");
                    System.out.println("   ~ Is a non-fiction book that explores the ongoing mass extinction event caused by human activities. Kolbert examines the impact of climate change, \nhabitat destruction, and pollution on various species, leading to their decline and potential extinction. The book provides a sobering and \ninformative look at the consequences of human actions on the planet's biodiversity and underscores the urgent need for conservation efforts.");
                    System.out.println("\n2. The year of Magical Thinking");
                    System.out.println("   ~ Is a memoir that chronicles the author's experiences during the year following the sudden death of her husband, John Gregory Dunne, and the serious \nillness of their daughter, Quintana Roo. Didion delves into the depths of grief, examining the emotional turmoil and the irrational thought \nprocesses that often accompany profound loss. The book is a deeply personal exploration of love, mourning, and the human \npsyche, offering a candid and heartrending look at the grieving process.");
                    System.out.println("\n3. No Logo by Naomi Klein");
                    System.out.println("   ~ Is a critical examination of the impact of corporate branding and consumer culture on society. The book delves into the way multinational \ncorporations have shaped public discourse, labor practices, and social values to promote their brands. Klein argues that this phenomenon has led to a \nhomogenized and commodified culture and explores the potential for resistance and alternative paths to a more just and sustainable world. ");
                    System.out.println("\n4. Birthday Letters by Ted Hughes");
                    System.out.println("   ~ Is a collection of poems that serves as a poignant and autobiographical exploration of his relationship with the American poet Sylvia Plath, \nwho was his wife. The poems offer a retrospective look at their tumultuous and passionate love story, as well as the grief and guilt he experienced \nfollowing Plath's tragic suicide. Hughes' deeply personal and emotionally charged poems provide insight into the complexities \nof their relationship and the enduring impact of their connection on his life and work. ");
                    System.out.println("\n5. Dreams from my Father by Barack Obama");
                    System.out.println("   ~ Is a memoir written by Barack Obama before he became the 44th President of the United States. In the book, Obama reflects on his early life, \nhis experiences growing up as the son of a Kenyan father and a Kansan mother, and his search for identity as a young African American man. The memoir \ndelves into issues of race, heritage, and the complexities of family, providing a deeply personal and introspective account of \nhis life and journey toward self-discovery.");
                }
                break;
            case "Comic Books":
                System.out.println("1. Ant-Man by Stan Lee");
                System.out.println("2. Anti-Venom by Dan Slott");
                System.out.println("3. Akira by Katsuhiro Otomo");
                System.out.println("4. Batman by Bob Kane");
                System.out.println("5. Blue is the warmest color by Jul Maroh");

                System.out.print("\nWould you like a summary of the books given? Yes or No: ");
                String userAnswer5 = scanner.nextLine();
                if ("Yes".equalsIgnoreCase(userAnswer5)) {
                    System.out.println("\n1. Ant-Man by Stan Lee");
                    System.out.println("   ~ After stealing the Ant-Man costume to save his daughter Cassandra Cassie Lang from a heart ailment, Scott Lang resolved to become the second Ant-Man. \nWith Hank Pym's support, Lang quickly transitioned from a life of crime to a full-time profession as Ant-Man.");
                    System.out.println("\n2. Anti-Venom by Dan Slott");
                    System.out.println("   ~ Is a storyline in Marvel Comics that features the character Eddie Brock, who was the original Venom. In this story, Eddie Brock undergoes a \ntransformation, becoming Anti-Venom, a character with a new, white-colored symbiote. As Anti-Venom, Brock possesses unique abilities and is driven to \ncleanse the world of other symbiotes, leading to conflicts with various Marvel superheroes and supervillains. The storyline explores \nthemes of redemption, identity, and the complex nature of symbiotes within the Marvel Universe. ");
                    System.out.println("\n3. Akira by Katsuhiro Otomo");
                    System.out.println("   ~ Is a Japanese manga series created by Katsuhiro Otomo that later inspired an animated film. The story is set in a post-apocalyptic Tokyo and \nfollows two friends, Kaneda and Tetsuo, who become embroiled in a government experiment with psychic powers. As Tetsuo's abilities grow out of control, \nit leads to a destructive clash with Kaneda and uncovers a deeper conspiracy that threatens the world. The series explores themes of \npower, corruption, and the consequences of unchecked scientific experimentation in a cyberpunk dystopian setting.");
                    System.out.println("\n4. Batman by Bob Kane");
                    System.out.println("   ~ Is a popular comic book character created by artist Bob Kane and writer Bill Finger. Batman, also known as Bruce Wayne, is a billionaire playboy \nwho takes on the persona of a vigilante superhero to fight crime in the fictional Gotham City. He has no superhuman powers but relies on his \nintelligence, martial arts skills, and an array of high-tech gadgets to combat a rogues' gallery of villains, most notably the Joker, Penguin, \nand Catwoman. Batman has become an iconic figure in popular culture, known \nfor his dark and brooding persona as the Caped Crusader.");
                    System.out.println("\n5. Blue is the warmest color by Jul Maroh");
                    System.out.println("   ~ Is a graphic novel by Julie Maroh that tells the poignant coming-of-age love story between two young women, Emma and Clementine. The book explores \ntheir intense and passionate relationship, the challenges they face, and the impact it has on their lives as they navigate the complexities of \nidentity, sexuality, and societal expectations. The novel is celebrated for its emotional depth and beautiful artwork, making it a significant \nwork in the LGBTQ+ literature and graphic novel genres.");

                }
                break;
            case "Self-Help":
                System.out.println("1. The Mountain is You by Brianna Wiest");
                System.out.println("2. Atomic Habits by James Clear");
                System.out.println("3 The power of Self-Discipline by Brain Tracy");
                System.out.println("4. The power of Letting Go by John Purkiss");
                System.out.println("5. The power of Now by Eckhart Tolle");

                System.out.print("\nWould you like a summary of the books given? Yes or No: ");
                String userAnswer6 = scanner.nextLine();
                if ("Yes".equalsIgnoreCase(userAnswer6)) {
                    System.out.println("\n1. The Mountain is You by Brianna Wiest");
                    System.out.println("   ~ Is a self-help book that guides readers through a journey of self-discovery and personal growth. The author encourages readers to confront their \ninner fears and insecurities, offering insights and exercises to help them develop self-awareness and build resilience. With a focus on \nself-compassion and self-empowerment, the book provides tools and wisdom to navigate life's challenges and find inner strength.");
                    System.out.println("\n2. Atomic Habits by James Clear");
                    System.out.println("   ~ Is a bestselling self-help book that explores the science of habit formation and provides practical strategies for making lasting positive changes in one's life. \nClear argues that small, incremental changes, or atomic habits, can lead to significant improvements over time. He delves into the psychology \nof habit formation, offers a four-step framework for habit change, and emphasizes the importance of environment and identity in sustaining positive habits. The book is a valuable resource for anyone looking to transform their behavior and achieve personal and professional goals.");
                    System.out.println("\n3 The power of Self-Discipline by Brain Tracy");
                    System.out.println("   ~ Is a motivational and self-help book that focuses on the importance of self-discipline in achieving personal and professional success. \nTracy offers practical advice, strategies, and techniques for developing and maintaining self-discipline, which he views as a key ingredient in \nsetting and achieving meaningful goals. The book emphasizes the role of habits, time management, and personal responsibility in harnessing the power of self-discipline to lead a more fulfilling and productive life.");
                    System.out.println("\n4. The power of Letting Go by John Purkiss");
                    System.out.println("   ~ Is a self-help book that explores the idea of letting go of the past, embracing change, and finding personal and professional success through a mindset shift. \nPurkiss draws from his experiences in leadership and offers insights on how to release attachments to the past and fear of the future. \nThe book provides practical strategies for individuals seeking to make positive changes in their lives, both personally and in their careers, by adopting a more flexible and open approach to life.");
                    System.out.println("\n5. The power of Now by Eckhart Tolle");
                    System.out.println("   ~ Is a spiritual and philosophical guide that encourages readers to live in the present moment, transcending the constant chatter of the mind and \nachieving a state of mindfulness and inner peace. Tolle explores the concept of ego and how it often drives suffering, offering practical advice on \nhow to free oneself from the tyranny of the past and future. The book has become a bestseller and a well-regarded resource for those seeking spiritual enlightenment and a deeper understanding of the human experience.");
                }
                break;
            case "Young Adult":
                System.out.println("1. The Summer of Broken Rules by K.L. Walther");
                System.out.println("2. The ballad of Songbirds and Snakes by Suzanne Collins");
                System.out.println("3. The Wizard of Earthsea by Ursula K. Le Guin");
                System.out.println("4. The Hobbit by John Tolkien");
                System.out.println("5. Lord of the Flies by William Golding");

                System.out.print("\nWould you like a summary of the books given? Yes or No: ");
                String userAnswer7 = scanner.nextLine();
                if ("Yes".equalsIgnoreCase(userAnswer7)) {
                    System.out.println("\n1. The Summer of Broken Rules by K.L. Walther");
                    System.out.println("   ~ Is a young adult novel that follows the story of Meredith, a rule-following high school student, who decides to break her own rules for the summer. \nShe joins a diverse group of friends and embarks on a journey of self-discovery, challenging her preconceived notions and embracing new experiences. \nThe novel explores themes of friendship, identity, and the transformative power of stepping outside one's comfort zone.");
                    System.out.println("\n2. The ballad of Songbirds and Snakes by Suzanne Collins");
                    System.out.println("   ~ Is a prequel to the popular Hunger Games series, set in the dystopian world of Panem. The story follows Coriolanus Snow, who is a young and ambitious \nmentor during the 10th Hunger Games. As he becomes involved with his tribute, Lucy Gray Baird, he grapples with his own moral choices and the complex \npolitics of the Capitol, shedding light on the origins of the Hunger Games and the rise of the Snow family's power.");
                    System.out.println("\n3. The Wizard of Earthsea by Ursula K. Le Guin");
                    System.out.println("   ~ Is the first book in the Earthsea series, a classic work of fantasy literature. The story follows Ged, a young boy with innate magical talent, as he \nembarks on a journey to learn the ways of wizardry on the mystical island of Roke. However, his quest for power and knowledge leads to a confrontation \nwith a dark force he inadvertently unleashed, challenging his skills and moral character. \nThe novel explores themes of balance, the consequences of one's actions, and the pursuit of wisdom, making it a timeless and introspective tale of a young wizard's coming of age.");
                    System.out.println("\n4. The Hobbit by John Tolkien");
                    System.out.println("   ~ Is a fantasy novel by J.R.R. Tolkien that follows the adventures of Bilbo Baggins, a hobbit who is reluctantly swept into an epic quest. Bilbo joins a \ngroup of dwarves on a journey to reclaim their homeland from the dragon Smaug. Along the way, they encounter various challenges, magical creatures, \nand moral dilemmas, and Bilbo undergoes a transformation from a timid hobbit to a hero. \nThe novel serves as a prelude to Tolkien's The Lord of the Rings series and is beloved for its imaginative world-building and compelling characters.");
                    System.out.println("\n5. Lord of the Flies by William Golding");
                    System.out.println("   ~ Is a classic novel that explores the dark aspects of human nature when a group of British boys becomes stranded on a deserted island. The story follows \ntheir descent into chaos and savagery as they attempt to establish order and governance. The book serves as an allegory for the inherent capacity \nfor cruelty and violence within human society, offering a thought-provoking commentary on the nature of civilization and the consequences of unchecked power.");
                }
                break;
            case "Manga":
                System.out.println("1. One Piece by Eiichiro Oda");
                System.out.println("2. Naruto by Masashi Kishimoto");
                System.out.println("3. Sand Land by Akira Toriyama");
                System.out.println("4. Shuna's Journey by Jayao Miyazaki");
                System.out.println("5. All you need is Kill by Hiroshi Sakurazaka");

                System.out.print("\nWould you like a summary of the books given? Yes or No: ");
                String userAnswer8 = scanner.nextLine();
                if ("Yes".equalsIgnoreCase(userAnswer8)) {
                    System.out.println("\n1. One Piece by Eiichiro Oda");
                    System.out.println("   ~ Is a popular and long-running Japanese manga and anime series created by Eiichiro Oda. The story follows Monkey D. Luffy, a young pirate with the ability to \nstretch his body like rubber after consuming a mystical fruit. Luffy sets out on a grand adventure to find the legendary treasure known as One \nPiece and become the Pirate King, while forming a diverse crew of pirates, each with unique abilities and backgrounds, and encountering numerous challenges and adversaries along the way. The series is known for its rich world-building, memorable characters, and epic battles, and it has garnered a dedicated fanbase worldwide.");
                    System.out.println("\n2. Naruto by Masashi Kishimoto");
                    System.out.println("   ~ Is a popular Japanese manga and anime series created by Masashi Kishimoto. The story revolves around Naruto Uzumaki, a young ninja with dreams of becoming the \nstrongest ninja and earning the title of Hokage, the leader of his village. As Naruto trains, forms bonds with his friends, and confronts formidable enemies, \nthe series explores themes of perseverance, friendship, and the consequences of one's actions, making it a highly influential and enduring part of the anime and manga landscape.");
                    System.out.println("\n3. Sand Land by Akira Toriyama");
                    System.out.println("   ~ Is a one-shot manga by Akira Toriyama, the creator of Dragon Ball. The story is set in a post-apocalyptic world where water is a scarce and precious resource, \ncontrolled by a ruthless king. The manga follows Sheriff Rao and his unlikely allies as they embark on a quest to find a new source of water and \nchallenge the oppressive regime.");
                    System.out.println("\n4. Shuna's Journey by Hayao Miyazaki");
                    System.out.println("   ~ Is a one-shot manga written and illustrated by the renowned filmmaker Hayao Miyazaki. The story follows Shuna, a young prince on a journey to find a way to save \nhis famine-stricken kingdom. Along the way, he encounters various challenges, magical creatures, and a forest spirit, ultimately discovering the \npower of nature and the importance of living in harmony with the environment. The manga showcases Miyazaki's talent for storytelling and his ecological themes, which would become a signature of his later works, such as Princess Mononoke and Nausicaä of the Valley of the Wind.");
                    System.out.println("\n5. All you need is Kill by Hiroshi Sakurazaka");
                    System.out.println("   ~ Is a science fiction novel that follows the story of Keiji Kiriya, a soldier who finds himself caught in a time loop during a war against alien invaders. \nEach time he dies in battle, he wakes up to relive the same day, gaining knowledge and skills to become a more effective soldier. The novel explores themes \nof war, survival, and the impact of repetitive experiences on an individual's psyche, resulting in a gripping and thought-provoking narrative.");
                }
                break;
            case "Mystery":
                System.out.println("1. A Good Girl's Guide to Murder by Holly Jackson");
                System.out.println("2. The Surgeon by Tess Gerritsen");
                System.out.println("3. One of us is Lying by Karen M. McManus");
                System.out.println("4. The Silent Patient by Alex Michaelides");
                System.out.println("5. We were liars by E. Lockhart");

                System.out.print("\nWould you like a summary of the books given? Yes or No: ");
                String userAnswer9 = scanner.nextLine();
                if ("Yes".equalsIgnoreCase(userAnswer9)) {
                    System.out.println("\n1. A Good Girl's Guide to Murder by Holly Jackson");
                    System.out.println("   ~ Is a young adult mystery novel that follows the story of Pippa Fitz-Amobi, a high school student investigating a murder case for a school project. \nPippa chooses to reexamine the murder of Andie Bell, a popular student, and believes there is more to the story than the official account suggests. \nAs she delves deeper into the investigation, Pippa uncovers dark secrets, hidden truths, and puts herself in danger \nwhile challenging the assumptions and judgments of her small town. The book combines elements of a gripping mystery with the complexities of teenage life, \nmaking it an engaging and suspenseful read for young adult audiences.");
                    System.out.println("\n2. The Surgeon by Tess Gerritsen");
                    System.out.println("   ~ Is a gripping medical thriller that follows the story of Dr. Catherine Cordell, a trauma surgeon in Boston who becomes the target of a serial killer. \nThe killer, known as The Surgeon, leaves a trail of gruesome murders reminiscent of a horrifying incident from Catherine's past, forcing her to confront her traumatic history. \nAs she works with detective Thomas Moore to catch the killer, the novel takes readers on a tense and \nchilling journey of suspense and psychological intensity.");
                    System.out.println("\n3. One of us is Lying by Karen M. McManus");
                    System.out.println("   ~ Is a young adult mystery novel set in a high school where five students are brought together for detention, but only four make it out alive. \nThe story follows the aftermath of the mysterious death of Simon, a student known for his gossip app, which planned to reveal secrets of the other four students. \nThe survivors are forced to confront their own secrets, relationships, and potential motives as they become suspects in a murder investigation. \nThe novel weaves a suspenseful narrative filled with unexpected twists and a focus on the complexities of teenage life and relationships.");
                    System.out.println("\n4. The Silent Patient by Alex Michaelides");
                    System.out.println("   ~ Is a psychological thriller novel that centers on Alicia Berenson, a talented artist who becomes mute after she's accused of brutally killing her \nhusband and subsequently refuses to speak. The story unfolds as Alicia is admitted to a secure psychiatric facility and begins to communicate only through her art. \nHer silence and the mystery surrounding the murder capture the attention of a psychotherapist, Theo Faber, who becomes \ndetermined to uncover the truth behind Alicia's silence and the events that led to the murder. The novel is marked by its gripping \nnarrative, psychological intrigue, and a shocking twist that keeps readers on the edge of their seats.");
                    System.out.println("\n5. We were liars by E. Lockhart");
                    System.out.println("   ~ Is a young adult novel that revolves around the wealthy and privileged Sinclair family and their summers spent on a private island. \nThe story follows Cadence Sinclair Eastman, who, after a traumatic accident two years prior, suffers from amnesia and returns to the island to piece together the events of that fateful summer. \nAs Cadence unravels the mysteries and secrets surrounding her family and her own past, the book delves into themes of memory, \nprivilege, and the consequences of buried truths, offering a powerful and suspenseful narrative with a shocking twist.");
                }
                break;
            case "Cook Books":
                System.out.println("1. Dessert Person by Claire Saffitz");
                System.out.println("2. From crook to cook by Snoop Dogg");
                System.out.println("3. Salt Fat Acid Heat bySamin Nosrat");
                System.out.println("4. Half Baked Harvest by Tieghan Gerand");
                System.out.println("5. The Modern Vegetarian Kitchen by Peter Berley");

                System.out.print("\nWould you like a summary of the books given? Yes or No: ");
                String userAnswer10 = scanner.nextLine();
                if ("Yes".equalsIgnoreCase(userAnswer10)) {
                    System.out.println("\n1. Dessert Person by Claire Saffitz");
                    System.out.println("   ~ Is a cookbook that offers a wide range of delectable dessert recipes, along with detailed instructions and tips for achieving \nprofessional-quality results at home. Claire, a former Bon Appétit test kitchen chef and YouTube personality, shares her expertise and passion for baking, making it accessible to home \nbakers of all skill levels. From classic cookies to intricate pastries, Dessert Person provides a delightful collection of \nsweet treats that will satisfy any dessert lover's cravings.");
                    System.out.println("\n2. From Crook to Cook by Snoop Dogg");
                    System.out.println("   ~ Is a cookbook that features a collection of the rapper's favorite recipes and culinary creations. The book combines Snoop's love \nfor cooking and his signature style, offering a diverse range of dishes from comfort food to gourmet meals. With a focus on simple and flavorful recipes, Snoop Dogg's cookbook provides \na unique blend of food, music, and his own brand of charisma, making it a fun and engaging addition to the world of celebrity cookbooks.");
                    System.out.println("\n3. Salt Fat Acid Heat by Samin Nosrat");
                    System.out.println("   ~ Is a popular and critically acclaimed cookbook and culinary guide. It explores the fundamental elements of cooking and how they can \nbe used to create delicious and balanced dishes. The book provides readers with a deeper understanding of the principles of seasoning and flavor, making it an invaluable resource for \nboth novice and experienced home cooks. ");
                    System.out.println("\n4. Half Baked Harvest by Tieghan Gerand");
                    System.out.println("   ~ Is a cookbook that offers a collection of flavorful and creative recipes inspired by her popular blog of the same name. With an \nemphasis on fresh, seasonal ingredients, Gerard provides readers with a wide range of dishes, from savory to sweet, with a focus on comfort food and beautiful presentation. Her accessible and \napproachable approach to cooking makes this cookbook a go-to resource for home cooks looking to elevate their \nculinary skills and explore new flavors.");
                    System.out.println("\n5. The Modern Vegetarian Kitchen by Peter Berley");
                    System.out.println("   ~ Is a vegetarian cookbook that celebrates the flavors and variety of plant-based cuisine. It provides a collection of innovative and \nwholesome recipes, incorporating a diverse range of vegetables, grains, and legumes. The book emphasizes the use of seasonal and fresh ingredients to create delicious vegetarian meals, \nmaking it a valuable resource for both experienced and aspiring vegetarians looking to expand their cooking repertoire.");
                }
                break;
            case "Smut":
                System.out.println("1. Haunting Adeline by H.D. Carlton");
                System.out.println("2. A touch of Darkness by Scarlett St. Clair");
                System.out.println("3. Twisted Love by Ana Huang");
                System.out.println("4. Twisted Hate by Ana Huang");
                System.out.println("5. Twisted Game by Ana Huang");

                System.out.print("\nWould you like a summary of the books given? Yes or No: ");
                String userAnswer11 = scanner.nextLine();
                if ("Yes".equalsIgnoreCase(userAnswer11)) {
                    System.out.println("\n1. Haunting Adeline by H.D. Carlton");
                    System.out.println("   ~ Adeline Reilly, a young author who has recently moved into her family's home in Washington state following the death of her grandmother. \nShe is stalked by Zade Meadows, the leader of an underground organization, Z, which aims to end human trafficking.");
                    System.out.println("\n2. A touch of Darkness by Scarlett St. Clair");
                    System.out.println("   ~ After a chance encounter with Hades, Persephone finds herself in a contract with the God of the Dead and the terms are impossible: \nPersephone must create life in the Underworld or lose her freedom forever. The bet does more than expose \nPersephone's failure as a goddess, however.");
                    System.out.println("\n3. Twisted Love by Ana Huang");
                    System.out.println("   ~ He has a heart of ice…but for her, he'd burn the world. Alex Volkov is a devil blessed with the face of an angel and cursed with a past he can't escape. \nDriven by a tragedy that has haunted him for most of his life, his ruthless \npursuits for success and vengeance leave little room for matters of the heart.");
                    System.out.println("\n4. Twisted Hate by Ana Huang");
                    System.out.println("   ~ Told from alternating first-person perspectives, Twisted Hate follows the hate-to-love romance between Jules Ambrose and Josh Chen. \nJules and Josh both navigate dark pasts, betrayal, and the vulnerability that comes with committed relationships.");
                    System.out.println("\n5. Twisted Game by Ana Huang");
                    System.out.println("   ~ Regal, strong-willed, and bound by the chains of duty, Princess Bridget dreams of the freedom to live and love as she chooses. \nBut when her brother abdicates, she's suddenly faced with the prospect of a loveless, \npolitically expedient marriage and a throne she never wanted.");

                }
                break;
            default:
                System.out.println("\nNo recommendations for the invalid choice.");
                break;
        }
    }
}