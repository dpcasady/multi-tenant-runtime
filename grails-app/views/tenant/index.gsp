<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Tenants</title>
    </head>
    <body>
        <div id="list-patient" class="content scaffold-list" role="main">
            <div class="row">
                <div>
                    <h1>Tenants</h1>
                    <ul>
                        <g:each var="m" in="${tenants}">
                            <li class="controller">
                                <g:link controller="tenant" action="select" id="${m}">${m}</g:link>
                            </li>
                        </g:each>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>
