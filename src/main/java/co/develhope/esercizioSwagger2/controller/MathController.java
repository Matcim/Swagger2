package co.develhope.esercizioSwagger2.controller;


import co.develhope.esercizioSwagger2.entities.ArithmeticOperation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping
@Api(value = "Esercizio2Swagger",description = "rest api")
public class MathController {


    @Autowired ArithmeticOperation arithmeticOperation;

    @PostMapping(value = "/divisione-info")
    @Tag(name = "matteo",description = "la mia prima api")
    @ApiOperation(value = "divisione info",httpMethod = "get")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses(
            { @ApiResponse(code = 200,message = "status code ok")}
    )
    public ArithmeticOperation divisionInfo(){
     return new ArithmeticOperation("matteo",25,"la mia prima api",
             new String[]{"chiamata post "});
    }

    @GetMapping(value = "/multiplication/{min}/{max}")
    @ApiOperation(value = "moltiplicazione tra 2 interi",httpMethod = "metodo get")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({@ApiResponse(code = 200,message = "status code ok")})
    public int multiplication(@PathVariable int min,@PathVariable int max){
        return min * max;
    }

    @PostMapping(value = "/moltiplicazione")
    @ApiOperation(value = "moltiplicazione array ",httpMethod = "metodo post")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({@ApiResponse(code = 201,message = "status code ok")})
    public int divisionInfo(@RequestBody int[] arrayInt){

        int result = 1;

        for(int i = 0; i < arrayInt.length; i++) {
          result = result * arrayInt[i];
        }
        return result;
    }

    @GetMapping(value = "/square/{n}")
    @ApiOperation(value = " ritorno di una stringa ",httpMethod = "metodo get")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({@ApiResponse(code = 200,message = "status code ok")})
    public String getMethod(@PathVariable String n){
        return n;
    }
}
