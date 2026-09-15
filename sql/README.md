# Base PostgreSQL da aula

Os scripts desta pasta foram copiados do commit indicado do projeto do professor.

1. Crie no pgAdmin um banco chamado `concessionaria`.
2. Abra o **Query Tool** desse banco.
3. Execute, nesta ordem: `01_pais.sql`, `02_estado.sql` e `03_cidade.sql`.
4. Informe a senha do seu PostgreSQL em `src/main/resources/application.properties` na propriedade `spring.datasource.password`.
5. Execute `EstruturaDadosApiApplication` no IntelliJ.

O PostgreSQL desta máquina responde na porta `5432`, já configurada no projeto.
