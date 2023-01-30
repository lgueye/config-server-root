Feature: Services should be properly configured

  Scenario: Servers should be properly configured
    Given "config-server-backend" configuration
      | env     | application | key            | value              |
      | any     | any         | product-shared | agile infra        |
      | default | any         | db.host        | local.pgserver     |
      | staging | any         | db.host        | staging.pgserver   |
      | prod    | any         | db.host        | prod.pgserver      |
      | prod    | service-d   | app-specific   | service d specific |
    When consumers refresh their configuration
    Then within "PT1S", consumers configuration
      | application | key            | value              |
      | service-a   | product-shared | agile infra        |
      | service-b   | product-shared | agile infra        |
      | service-c   | product-shared | agile infra        |
      | service-d   | product-shared | agile infra        |
      | service-a   | db.host        | local.pgserver     |
      | service-b   | db.host        | staging.pgserver   |
      | service-c   | db.host        | staging.pgserver   |
      | service-d   | db.host        | prod.pgserver      |
      | service-d   | app-specific   | service d specific |

