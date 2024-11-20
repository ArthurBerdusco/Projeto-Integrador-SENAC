package br.com.app;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class MestreDosMagos {

    public static void main(String[] args) throws InterruptedException, IOException {
        menu();
    }

    public static int menu() throws InterruptedException, IOException {
        int escolha = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("================================================================================================\n"
                + "                      O    M  E  S  T  R  E    D  O  S    M  A  G  O  S \n"
                + "================================================================================================\n");
        do {
            System.out.println("[ 1 ] Jogar \n[ 2 ] Instruções \n[ 3 ] Créditos \n[ 4 ] Sair\nSua Escolha:  ");

            try{
                            escolha = input.nextInt();

            }catch(Exception ext){
                menu();
            };
            
        }
        while(escolha < 0 || escolha > 4);

            if (escolha == 1) {
                System.out.print("Bem vindo ao jogo! \n\n");
                introducao();
                historia();
                ArrayList personagem = personagemInicial();
                hallEscola(personagem);
            } else if (escolha == 2) {
                System.out.println("Um role-playing game (RPG) é um jogo em que cada participante assume o papel de um personagem, \ngeralmente em um cenário de fantasia ou ficção científica, que pode interagir dentro do mundo \nimaginário do jogo.\n\nO mestre dos magos é um jogo de mistério e aventura. Você enfrentara monstros, enigmas, portas\nque precisarão de chave para abrir entre nesse desafio e tente finalizar o jogo!" + "\n\n[ 1 ] Voltar para o menu");
                escolha = input.nextInt();
                menu();
            } else if (escolha == 3) {
                System.out.println("PROJETO INTEGRADOR  -  SENAC  |  TURMA 1ºB  1º SEMESTRE 2022 ANALISE E DESENVOLVIMENTO DE SISTEMAS\n\nINTEGRANTES: \nARTHUR SILVA BERDUSCO \nCLERISTON FERNANDES DE SOUZA \nJONATHAN COSTA DE JESUS \nJULIO CESAR FERREIRA" + "\n\n[ 1 ] Voltar para o menu");
                escolha = input.nextInt();
                menu();
            } else if (escolha == 4) {
                System.out.println("Até Logo!");
                System.exit(0);
            } else {
                System.out.println("Opção inválida. Tente novamente: ");
                menu();
            }

            return escolha;

        }
       

    public static void introducao() throws InterruptedException, IOException {
        printComDelay("\nO jogo que você está prestes a jogar, conta a história de um jovem mago que descobriu seus \n"
                + "poderes ao longo da vida adulta, e agora ele está dispostos a pagar caro para poder entender e conviver \n"
                + "com esse dom que nasceu. É um jogo de muito mistério e com vários quebra cabeças. Durante o jogo \n"
                + "você enfrentará vários obstáculos para que no final você se torne o maior mago de toda a história. \n"
                + "Boa sorte!\n");
    }

    public static void historia() throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        printComDelay("Aperte [1] para pular a história ou digite [2] para ler a história.");
        int decisao = input.nextInt();
        if (decisao == 1) {
            System.out.println("""
					"Antes de começarmos, vamos entender de onde você veio...
					Você nasceu em uma familia normal de humanos no sul da europa e durante toda a sua infância,  
					você percebia que não era parecido com os amigos ao seu redor. Você percebeu isso pela primeira vez 
					quando foi em uma festa, e por causa das suas habilidades, (que entre elas são: Audição e Olfato aguçado, 
					Visão Noturna, e Sexto Sentido) conseguia enxergar tudo e todos quando ouve uma queda de energia. 
					A partir desse dia, você começou a pesquisar tudo relacionado com o que você presenciava no seu dia-a-dia. 
					Passaram-se anos e você teve sua 2ª experiçncia. O que aconteceu foi, que com seus 22 anos de idade, 
					alguém tentou roubar sua mãe, a pessoa mais importante para você de toda sua vida, e depois de um ataque  
					de fúria, você  quase matou o ladrão, soltando uma onda de calor com suas mãos em sua direção. Sua mãe  
					por sorte não viu o que aconteceu porque foi a delegacia chamar pela polícia pouco antes disso ter acontecido.
					Após o ocorrido você percebeu que tinha traços de um mago e não sabia lidar com tais habilidades, por causa  
					disso pretendia sair de casa porque você poderia ser um perigo aos seus pais e ao seu lar. Na mesma noite 
					tu achastes um site que dizia 'Venha à universidade encantada, dispute com oponentes, vença todos os desafios,
					e você se tornará um dos maiores magos de toda a história [Vagas disponíveis 45/50]'.Você não pensou  
					duas vezes e logo se inscreveu nessa grande oportunidade, isso poderia ser uma das chances para sair de  
					casa e deixar de ser um perigo as pessoas que ama.
					Dois dias se passaram e você se depara com uma mensagem em seu e-mail, dizendo que foi aprovado e o desafio 
					iria começar após quatro dias. Imediatamente você começa a separar suas roupas e tudo o que precisa para 
					deixar seu lar.
					Quatro dias se passam e você deixa uma carta para seus pais dizendo tudo o que aconteceu com você durante  
					toda sua vida de um possível 'mago' e sai no meio da madrugada em direção a universidade encantada.
					Chegando lá você se depara com mais 50 oponentes, e 2 Magos Supremos que ditam como irá ser o desafio. 
					Todos vocês são levados ao Hall Principal com uma faixa diante de seus olhos para não saberem de onde vieram 
					a partir daí os Magos Supremos começam e instruir todos e contam como irá ser o desafio. Eles disseram:
					'Vocês terão 6 salas ao todo nesse desafio para adquirir conhecimento e lutar contra o obstáculo final.  
					Duas delas envolvem batalhas. Um detalhe...esse desafio pode valer a vida de vocês portanto vasculhem  
					e usufruam do máximo de salas que puderem, pois somente um de vocês levará o titulo de: O Maior Mago!.
					Boa sorte, a partir de agora vocês estão por conta própria.
					Após a intrução dos magos você inicia o desafio contra 50 pessoas e tenta ao máximo dar o seu melhor.\n""");
        } else {
            printComDelay("Antes de começarmos, vamos entender de onde você veio...\n"
                    + "Você nasceu em uma familia normal de humanos no sul da europa e durante toda a sua infância, \n"
                    + "você percebia que não era parecido com os amigos ao seu redor. Você percebeu isso pela primeira vez \n"
                    + "quando foi em uma festa, e por causa das suas habilidades, (que entre elas são: Audição e Olfato aguçado, \n"
                    + "Visão Noturna, e Sexto Sentido) conseguia enxergar tudo e todos quando ouve uma queda de energia.\n"
                    + "A partir desse dia, você começou a pesquisar tudo relacionado com o que você presenciava no seu dia-a-dia.\n "
                    + "Passaram-se anos e você teve sua 2ª experiçncia. O que aconteceu foi, que com seus 22 anos de idade, \n"
                    + "alguém tentou roubar sua mãe, a pessoa mais importante para você de toda sua vida, e depois de um ataque \n"
                    + "de fúria, você  quase matou o ladrão, soltando uma onda de calor com suas mãos em sua direção. Sua mãe \n"
                    + "por sorte não viu o que aconteceu porque foi a delegacia chamar pela polícia pouco antes disso ter acontecido.\n"
                    + "Após o ocorrido você percebeu que tinha traços de um mago e não sabia lidar com tais habilidades, por causa \n"
                    + "disso pretendia sair de casa porque você poderia ser um perigo aos seus pais e ao seu lar. Na mesma noite \n"
                    + "tu achastes um site que dizia 'Venha à universidade encantada, dispute com oponentes, vença todos os desafios, \n"
                    + "e você se tornará um dos maiores magos de toda a história [Vagas disponíveis 45/50]'.\nVocê não pensou "
                    + "duas vezes e logo se inscreveu nessa grande oportunidade, isso poderia ser uma das chances para sair de \n"
                    + "casa e deixar de ser um perigo as pessoas que ama.\n"
                    + "Dois dias se passaram e você se depara com uma mensagem em seu e-mail, dizendo que foi aprovado e o desafio \n"
                    + "iria começar após quatro dias. Imediatamente você começa a separar suas roupas e tudo o que precisa para \n"
                    + "deixar seu lar.\n"
                    + "Quatro dias se passam e você deixa uma carta para seus pais dizendo tudo o que aconteceu com você durante \n"
                    + "toda sua vida de um possível 'mago' e sai no meio da madrugada em direção a universidade encantada.\n"
                    + "Chegando lá você se depara com mais 50 oponentes, e 2 Magos Supremos que ditam como irá ser o desafio.\n"
                    + "Todos vocês são levados ao Hall Principal com uma faixa diante de seus olhos para não saberem de onde vieram \n"
                    + "a partir daí os Magos Supremos começam e instruir todos e contam como irá ser o desafio. Eles disseram:\n"
                    + "'Vocês terão 6 salas ao todo nesse desafio para adquirir conhecimento e lutar contra o obstáculo final. \n"
                    + "Duas delas envolvem batalhas. Um detalhe...esse desafio pode valer a vida de vocês portanto vasculhem \n"
                    + "e usufruam do máximo de salas que puderem, pois somente um de vocês levará o titulo de: O Maior Mago!.\n"
                    + "Boa sorte, a partir de agora vocês estão por conta própria.'\n"
                    + "Após a intrução dos magos você inicia o desafio contra 50 pessoas e tenta ao máximo dar o seu melhor.\n");
        }
    }

    public static void senhaBossFinal(ArrayList personagem) {
        Random random = new Random();
        String senhaEmbaralhada = "";
        String palavraSenha = "";
        int aleatorio = random.nextInt(4);
        switch (aleatorio) {
            case 0:
                senhaEmbaralhada = "SENAC";
                palavraSenha = "SENAC";
                break;
            case 1:
                senhaEmbaralhada = "DESENVOLVEDOR";
                palavraSenha = "DESENVOLVEDOR";
                break;
            case 2:
                senhaEmbaralhada = "ECLIPSE";
                palavraSenha = "ECLIPSE";
                break;
            case 3:
                senhaEmbaralhada = "ALGORITMO";
                palavraSenha = "ALGORITMO";
                break;
        }
        List<String> SenhaLetrasEmbaralhadas = Arrays.asList(senhaEmbaralhada.split(""));
        Collections.shuffle(SenhaLetrasEmbaralhadas);
        personagem.set(11, SenhaLetrasEmbaralhadas);
        personagem.set(12, palavraSenha);
    }

    public static ArrayList personagemInicial() throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o nome do seu mago: ");
        String nomePersonagem = input.next();
        ArrayList<Object> personagem = new ArrayList();
        //CRIAÇÃO INICIAL DAS CARACTERISTICAS DO PERSONAGEM
        personagem.add(nomePersonagem);// (0)NOME
        personagem.add(100);// (1)VIDA
        personagem.add(false);// (2)PODER
        personagem.add("");// (3)LETRA SENHA ENCONTRADAS
        personagem.add(false);// (4)FLAUTA
        personagem.add(false);// (5)CHAVE corredorZelador
        personagem.add(false);// (6)CAPA INVISIBILIDADE
        personagem.add(false);// (7)DERROTOU GLOBINS
        personagem.add(false);// (8)DRAGÃO DORMINDO
        personagem.add(0);// (9)AULAS
        personagem.add(false);// (10)LIVROS
        personagem.add("");// (11)LISTA LETRAS ALEATORIAS PARA ZERAR O GAME
        personagem.add("");// (12)LETRAS SENHA ORGANIZADA
        personagem.add(false); // (13)ACESSO A FLORESTA
        personagem.add(false); // (14)JA ACESSOU A FLORESTA
        printComDelay("\nOlá mago " + personagem.get(0) + "\nSua vida: " + personagem.get(1) + "\n");
        return personagem;
    }

    public static void hallEscola(ArrayList personagem) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        printComDelay("Você está no Hall principal que dá acesso: \n");
        System.out.println("Escolha uma direção: \n"
                + "\n                    [1] Sala Zelador"
                + "\n                     ^\n"
                + "\nBiblioteca [2] <           > [3] Sala De aula 	\n"
                + "\n                     v"
                + "\n                    [4] Floresta Obscura");
        int direcao = input.nextInt();
        switch (direcao) {
            case 1:
                corredorZelador(personagem);
                break;
            case 2:
                biblioteca(personagem);
                break;
            case 3:
                salaAula(personagem);
            case 4:
                if (personagem.get(13).equals(false)) {
                    printComDelay("Você deve assistir as aulas para ter acesso a floresta.");
                    hallEscola(personagem);
                } else {
                    sala3(personagem);
                }
                break;
            default:
                System.out.println("Opção invalida.");
                hallEscola(personagem);
        }
    }

    public static void salaAula(ArrayList personagem) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        printComDelay("Você entrou na sala de aula.\n");
        int quantAula = (int) personagem.get(9);
        if (quantAula == 0) {
            printComDelay("Aula 1: A floresta sombria.\n\n" + "Professor Croutch: Caros alunos, os arredores da escola escondem muitos mistérios \n" + "e também é protegida por monstros selvagens. Se vocês quiserem vocês podem arriscar a entrar nela e tentar encontrar a caverna do dragão\n" + "aonde você poderá conseguir um item muito importante. Estejam preparados. Estarei entregando a vocês a chave de acesso a floresta.\n" + "Porém tomem cuidado, as vezes precisamos nos aperfeiçor mais para poder ganhar algumas batalhas...\n\n" + "Você obteve: + Chave de acesso a floresta.\n");
            printComDelay("Voltando ao Hall Principal... Volte para a sala de aula novamente para assitir às duas últimas aulas.");
            personagem.set(9, 1);
            personagem.set(13, true);
            hallEscola(personagem);
        } else if (quantAula == 1) {
            printComDelay("Aula 2: Uma ferramenta muito poderosa se usada sabiamente.\n\n" + "Professor Neville: As vezes nos deparamos com ferrametas que nós não temos a minima ideia para que servem\n" + "hoje estarei entregando a todos vocês, está linda fláuta.\n" + "Vocês saberam o momento correto de utiliza-la...\nNa proxima aula \"3\" vocês aprenderam novas magias, assistam para se tornarem mais fortes \nVocês também pode ir a biblioteca para mais dicas e para restaurar sua vida! \n\n" + "Você obteve: + Fláuta Dourada\n");
            printComDelay("\nVoltando para o hall principal...");
            personagem.set(9, 2);
            personagem.set(4, true);
            hallEscola(personagem);
        } else if ((quantAula == 2) && (personagem.get(14).equals(true))) {
            printComDelay("Aula 3: Aprendendo novas magias.\n\n" + "Professora Hermione: As batalhas podem ser perigosas se você não souber\n" + "utilizar as magias corretas. " + "Hoje vocês vão aprender as principais magias que vão tornar você um mago muito \n" + "mais forte e preparado para as batalhas.\n" + "Vocês também podem acessar a biblioteca para aprender e recuperar as suas energias.\n\n" + "Você obteve: + Poder em magia\n");
            printComDelay("\nAgora você já pode derrotar os goblins sem nenhum esforço.");
            personagem.set(9, 3);
            personagem.set(2, true);
            hallEscola(personagem);
        } else if (quantAula == 3) {
            printComDelay("Você já assitiu todas as aulas. Dica do jogo: Se você quiser assistir às outras aulas, "
                    + "veja seu histórico de ações no console.");
            printComDelay("Voltando ao Hall Principal...");
            hallEscola(personagem);
        } else {
            printComDelay("Você deve ir a floresta para poder assistir a aula 3\n");
            hallEscola(personagem);
        }
    }

    public static void biblioteca(ArrayList personagem) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        printComDelay("Você está na biblioteca. Diante de você estão três livros com dicas preciosas para"
                + " você poder jogar com mais maestria. Aqui você também pode \nrestaurar sua vida!!");
        System.out.println("Escolha a opção desejada: \n[ 1 ] Livro: Como domar seu dragão   \n[ 2 ] Livro: Atenção às salas   \n[ 3 ] Livro: O grande desafio   \n[ 4 ] Sala escondida \n[ 5 ] Descançar \n[ 6 ] Voltar para o hall");
        String decisao = input.nextLine().toLowerCase();
        if (decisao.equals("1")) {
            printComDelay("\nComo domar seu dragão. A dica é:\n\nTome muito cuidado com os dragões, pois basta somente\n" + "um ataque deles acabar com sua vida. Portanto use um item que faça o dragão dormir.");
            System.out.print("\nVocê deseja ler mais um livro, ou voltar para o Hall principal? \n[Ler] ou [Voltar]: ");
            String decisao1 = input.next().toLowerCase();

            if (decisao1.equals("ler")) {
                printComDelay("\nAtenção às salas. A dica é:\n\nNa sala à frente do hall principal, há um zelador guardando\n" + "a porta para o grande desafio.\n" + "use um item misterioso para poder ficar invisível e conseguir passar por ele.");
                System.out.print("\nVocê deseja ler o último livro, ou voltar para o Hall principal? \n[Ler] ou [Voltar]: ");
                String decisao2 = input.next().toLowerCase();

                if (decisao2.equals("ler")) {
                    printComDelay("\nO grande desafio. A dica é:\n\nO grande desafio fica depois do tão temido zelador. Prepare-se\n" + "porque no grande desafio será dado a você várias palavras embaralhadas\nPrepare suas habilidades para poder desvenda-los\n" + "e passar ileso ao Boss Final");
                    printComDelay("\nVocê já leu todos os livros possíveis na biblioteca. Voltando para o Hall Principal...\n");
                    hallEscola(personagem);
                } else {
                    printComDelay("Voltando para o Hall principal...");
                    hallEscola(personagem);
                }
            } else {
                printComDelay("Voltando para o Hall Principal...");
                hallEscola(personagem);
            }

        } else if (decisao.equals("2")) {
            printComDelay("Atenção às salas. A dica é:\n\nNa sala à frente do hall principal, há um zelador guardando\n" + "a porta para o grande desafio. Não tente lutar com o zelador. Ele te dará muito dano,\n" + "use um item misterioso para poder ficar invisível e conseguir passar por ele.");
            System.out.println("\nVocê deseja ler o útlimo livro, ou voltar para o Hall principal? \n[Ler] ou [Voltar]: ");
            String decisao1 = input.next().toLowerCase();

            if (decisao1.equals("ler")) {
                printComDelay("\nO grande desafio. A dica é:\n\nO grande desafio fica depois do tão temido zelador. Prepare-se\n" + "porque no grande desafio será dado a você várias palavras embaralhadas\nPrepare suas habilidades para poder desvenda-los\n" + "e passar ileso ao Boss Final");
                printComDelay("Você acaba de ler todos os livros disponíveis na biblioteca. Voltando para o Hall Principal");
                hallEscola(personagem);
            } else {
                printComDelay("Voltando ao Hall Principal...");
                hallEscola(personagem);
            }

        } else if (decisao.equals("3")) {
            printComDelay("\nO grande desafio. A dica é:\n\nO grande desafio fica depois do tão temido zelador. Prepare-se\n" + "porque no grande desafio será dado a você várias palavras embaralhadas\nPrepare suas habilidades para poder desvenda-los\n" + "e passar ileso ao Boss Final");
            printComDelay("Você escolheu ler o 3° Livro (o útlimo deles). Voltando para o Hall Principal...");
            hallEscola(personagem);
        } else if (decisao.equals("4")) {
            printComDelay("Se você dizer em voz alta na biblioteca [Sala Escondida] antes de selecionar algum livro para "
                    + "ler, você irá encontrar uma sala escondida\n");
            biblioteca(personagem);
        } else if (decisao.equals("sala escondida")) {
            salaEscondida(personagem);
        } else if (decisao.equals("5")) {
            System.out.println("Sua vida: " + personagem.get(1));
            if ((int) personagem.get(1) == 100) {
                printComDelay("Você já esta descansado.");
                biblioteca(personagem);
            } else {
                int vidaRestaurada = 100 - (int) personagem.get(1);
                personagem.set(1, 100);
                printComDelay("Você dormiu por algumas horas e recarregou suas energias." + "\n+" + vidaRestaurada + " de vida \nSua vida: " + personagem.get(1));
                biblioteca(personagem);
            }
        } else if (decisao.equals("6")) {
            System.out.println("Voltando para o Hall Principal...");
            hallEscola(personagem);
        } else {
            printComDelay("Hmmm, não entendi. Tente denovo por favor.");
            biblioteca(personagem);
        }
    }

    public static void sala3(ArrayList personagem) throws InterruptedException, IOException {
        personagem.set(14, true);
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int vidaGlobins = 60;
        int escolha;
        if (personagem.get(7).equals(false)) {
            printComDelay("Você entrou na floresta sombria.\n" + "A floresta está escura, e você está escutando diversos passos ao seu redor\n" + "Você segue em frente, e caminha alguns metros a procura da caverna da montanha ao sul\n" + "Derrepente...\n" + "Um aglomerado de criaturas, \"Goblins\", não estão nada feliz\n" + "com a sua presença, e estão em posição de ataque.\n  \nVida gangue goblins: " + vidaGlobins + "\nSua vida: " + personagem.get(1) + "\n");
            do {
                System.out.println("O que você deseja fazer: \n[ 1 ] Atacar \n[ 2 ] Voltar ao hall da escola\n");
                escolha = input.nextInt();
                if (escolha == 1) {
                    int danoRecebido = random.nextInt(25 + 1 - 15) + 15;
                    int danoCausado = 0;
                    if (personagem.get(2).equals(false)) {
                        danoCausado = random.nextInt(10 + 1 - 5) + 5;
                    } else if (personagem.get(2).equals(true)) {
                        danoCausado = random.nextInt((15 + 1 - 10) + 10) * 3;
                    }
                    vidaGlobins = vidaGlobins - danoCausado;
                    personagem.set(1, ((int) personagem.get(1) - danoRecebido));
                    if ((int) personagem.get(1) > 30) {
                        printComDelay("Você atacou a orda de goblins com chamas e eles contra-atacaram\n");
                        System.out.println("Você foi ferido. -" + danoRecebido + " vida | " + "Sua vida: " + personagem.get(1) + "\nVocê feriu a gangue de goblins. -" + danoCausado + " vida | " + "Vida Gangue Goblins: " + vidaGlobins + "\n");
                    } else if ((int) personagem.get(1) <= 0) {
                        personagem.set(1, 0);
                        printComDelay("Você atacou a orda de goblins com chamas e eles contra-atacaram\n");
                        System.out.println("Você foi ferido. -" + danoRecebido + " vida" + "Sua vida: " + personagem.get(1));
                        gameOver();
                        break;
                    } else if ((int) personagem.get(1) < 30) {
                        printComDelay("Você atacou a orda de goblins com chamas e eles contra-atacaram\n");
                        System.out.println("Você foi ferido. -" + danoRecebido + " vida | " + "Sua vida: " + personagem.get(1) + "\nVocê feriu a gangue de goblins. -" + danoCausado + " vida | " + "Vida Gangue Goblinss: " + vidaGlobins + "\n");
                        printComDelay("\nVocê está com pouca vida...\n" + "Talvez você deva voltar a escola e aprender mais na aula 3 ou recuperar sua vida de alguma forma\n");
                    }

                    if ((int) personagem.get(1) <= 0) {
                        System.out.println("GAME OVER");
                    } else if ((vidaGlobins <= 0)) {
                        personagem.set(7, true);
                        printComDelay("Você derrotou a gangue de goblins.\n");
                        System.out.println("Escolha uma direção: \n"
                                + "                          [1] Hall principal\n"
                                + "                           ^\n"
                                + "\nCaverna do Dragão[2] <          ");
                        escolha = input.nextInt();
                        if (escolha == 1) {
                            hallEscola(personagem);
                        } else if (escolha == 2) {
                            cavernaDragao(personagem);
                        }
                    }
                } else if (escolha == 2) {
                    hallEscola(personagem);
                }
            } while ((vidaGlobins > 0) && ((int) personagem.get(1) > 0));
        } else if (personagem.get(7).equals(true)) {
            System.out.println("Você está na floresta.\n"
                    + "Escolha uma direção: \n");
            System.out.println("                  [1] Hall Principal"
                    + "\n                          ^\n"
                    + "\nCaverna Do Dragão [2] <          ");
            escolha = input.nextInt();
            if (escolha == 1) {
                hallEscola(personagem);
            } else if (escolha == 2) {
                cavernaDragao(personagem);
            }
        }

    }

    public static void cavernaDragao(ArrayList personagem) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        int escolha;
        int vidaDragao = 500;
        if (personagem.get(8).equals(false)) {
            printComDelay("Você entrou na caverna. \n" + "Ao fundo você enxerga uma luz brilhante. Você caminha mais alguns passsos,\n" + "quanto mais você se aproxima da luz, você começa algo estranho\n" + "Essa não... É um dragão, ele está furioso com a sua intrusão na caverna.\n" + "No peito do dragão você vê um colar, com uma chave dourada.\n" + "Essa chave deve ter alguma serventia.\n" + "O dragão avança sobre você.\n \nVida do dragão: " + vidaDragao + "\nSua vida: " + personagem.get(1) + "\n");
            do {
                System.out.println("O que você quer fazer: \n[ 1 ] Atacar\n[ 2 ] Usar a fláuta\n[ 3 ] Voltar para a floresta");
                escolha = input.nextInt();
                if (escolha == 1) {
                    Random random = new Random();
                    int danoRecebido = random.nextInt(70 + 1 - 40) + 40;
                    int danoCausado = random.nextInt((15 + 1 - 10) + 10) * 3;
                    vidaDragao = vidaDragao - danoCausado;
                    personagem.set(1, ((int) personagem.get(1) - danoRecebido));
                    printComDelay("Você atacou o dragão, e ele contra-atacou lançando à você chamas.\n" + "Você foi ferido. -" + danoRecebido + " vida \n" + "Você feriu o dragão. -" + danoCausado + " vida \n" + "Sua vida: " + personagem.get(1) + "\n" + "Vida Dragão: " + vidaDragao + "\n");
                } else if (escolha == 2) {
                    printComDelay("Você emitiu sons com a fláuta, o dragão foi ficando cada vez mais manso.\n" + "até que ele se caiu no chão. E pelo que parece começou a dormir.\n" + "Você pegou a chave do seu pescoço.\n\n" + "Você obteve: + Chave Dourada \n");
                    personagem.set(5, true);
                    personagem.set(8, true);
                    System.out.println("Oque você deseja fazer: \n[ 1 ] Voltar para a floresta");
                    escolha = input.nextInt();
                    if (escolha == 1) {
                        sala3(personagem);
                    }
                } else if (escolha == 3) {
                    sala3(personagem);
                }

                if ((int) personagem.get(1) <= 0) {
                    gameOver();
                }
            } while (((int) personagem.get(1) > 0) && (escolha != 1));
        } else if (personagem.get(8).equals(true)) {
            printComDelay("Você entrou na caverna novamente, e o dragão ainda está dormindo.\n" + "Oque você quer fazer: \n[ 1 ] Voltar para a floresta");
            escolha = input.nextInt();
            if (escolha == 1) {
                sala3(personagem);
            }
        }

    }

    public static void salaEscondida(ArrayList personagem) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        if (personagem.get(5).equals(true)) {
            personagem.set(6, true);
            printComDelay("Você entrou na sala escondida, e diante de você está a capa da invisibilidade!\n\n" + "Você obteve: + Capa da invisibilidade\n" + "Voltando para o Hal Principal...\n");
            hallEscola(personagem);
        } else {
            printComDelay("Você precisa de uma chave para poder entrar nessa sala. Vasculhe pelo campus para desbloquear.\n");
            biblioteca(personagem);
        }
    }

    public static void corredorZelador(ArrayList personagem) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        if (personagem.get(6).equals(false)) {
            printComDelay("Você entrou em um corredor escuro. O ambiente está com um ar misterioso e o zelador da escola está protegendo a passagem..." + "\nZelador: Olá caro " + personagem.get(0) + ", você não tem autorização para passar por este corredor!\n");
            System.out.println("O que você quer fazer \n[ 1 ] Tentar Passar a força \n[ 2 ] Voltar ao hall principal");
            int escolha = input.nextInt();
            if (escolha == 1) {
                printComDelay("Zelador: Eii , eu disse que você não tem permissão!!\n" + "O zelador conteve você. \nVocê foi levado para o hall principal.");
                hallEscola(personagem);
            } else if (escolha == 2) {
                hallEscola(personagem);
            }
        } else if (personagem.get(6).equals(true)) {
            printComDelay("Você está usando a capa da invisibilidade e entrou no corredor que o zelador está vigiando.");
            System.out.println("Escolha uma direção: \n"
                    + "        [1] O Grande desafio\n"
                    + "         ^\n"
                    + "\n                	\n"
                    + "\n         v"
                    + "\n        [4] Hall Principal");
            int escolha = input.nextInt();
            if (escolha == 1) {
                sotaoFinal(personagem);
            } else if (escolha == 4) {
                hallEscola(personagem);
            }
        }
    }

    public static void sotaoFinal(ArrayList personagem) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        printComDelay("Você passou bem devagar ao lado do zelador. Ele por um momento olhou na sua direção \nporém você conseguiu passar despercebidamente. Você subiu as escadas do corredor...\n" + "Você está de frente a uma grande porta. " + "Ao seu lado direito você vê um enigma. \nAlgo que se parece com um quebra cabeça de letras que está faltando algumas peças...");
        System.out.println("[ 1 ] Tentar Resolver o Enigma \n[ 2 ] Voltar");
        int escolha = input.nextInt();
        if (escolha == 2) {
            sotaoFinal(personagem);
        } else if (escolha == 1) {
            senhaBossFinal(personagem);
            for (int i = 3; i > 0; i--) {
                System.out.println("Você tem: " + i + " tentativa: ");
                System.out.println(personagem.get(11));
                System.out.println("Digite a resposta do enigma: ");
                String respostaJogador = input.next();
                if (respostaJogador.equalsIgnoreCase((String) personagem.get(12))) {
                    goodGame();
                    i = -1;
                } else if ((i == 2) || (i == 3)) {
                    System.out.println("As letras não se encaixaram...");
                } else if (i == 1) {
                    printComDelay("As letras não se encaixaram novamente." + "Algo muito rápido atingiu você na cabeça." + "Você desmaiou");
                    Random random = new Random();
                    int reduzirVida = random.nextInt(25 + 1 - 5) + 5;
                    personagem.set(1, ((int) personagem.get(1) - reduzirVida));
                    System.out.printf("-%d de vida\n", reduzirVida);
                    System.out.printf("Sua vida: %d\n", personagem.get(1));
                    if ((int) personagem.get(1) <= 0) {
                        gameOver();
                    } else {
                        printComDelay("Você acordou no hall da escola");
                        hallEscola(personagem);
                    }
                }
            }
        }
    }

    public static void goodGame() throws InterruptedException, IOException {
        printComDelay("Você conseguiu abrir a porta e adentrou na sala. A sua frente você vê uma joia que está flutuando.\n"
                + "Ao seu lado têm um pergaminho. \nVocê pega o pergaminho e comaça a ler: \n"
                + "Parabens grande mago. Você conseguiu passar por todos os desafios. E como recompença, você receberá\n"
                + "está joia. Ela te tornará o mago mais forte desse universo. E apartir de agora, você será responsavel\n"
                + "pelo comando desta escola de magia.\n\n"
                + "Você obteve: Joia Kzar\n"
                + "F  I  M    D  E    J  O  G  O");
        menu();
    }

    public static void gameOver() throws InterruptedException, IOException {
        printComDelay("Você morreu.");
        printComDelay("G  A  M  E    O  V  E  R");
        menu();
    }

    public static void printComDelay(String frase)
            throws InterruptedException, IOException {
        TimeUnit unit = null;
        for (char ch : frase.toCharArray()) {
            System.out.print(ch);
            unit.MILLISECONDS.sleep(30);
        }
        System.out.println();
    }
}
