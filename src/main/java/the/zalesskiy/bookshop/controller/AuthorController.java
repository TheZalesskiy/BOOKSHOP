package the.zalesskiy.bookshop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import the.zalesskiy.bookshop.model.Author;
import the.zalesskiy.bookshop.service.AuthorService;

/**
 * AuthorController class
 *
 * @author Evgeniy Zalesskiy
 */
@Controller
public class AuthorController {
    private AuthorService authorService;

@Autowired
    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public String listAuthor(Model model) {
        model.addAttribute("author", new Author());
        model.addAttribute("listAuthors", this.authorService.listAuthors());

        return "authors";
    }

    @RequestMapping(value = "/author/add", method = RequestMethod.POST)
    public String addAuthor(@ModelAttribute("author") Author author) {
        if (author.getId() == 0){
            this.authorService.addAuthor(author);
        }else {
            this.authorService.updateAuthor(author);
        }

        return "redirect:/authors";
    }

    @RequestMapping("/authors/remove/{id}")
    public String editAuthor(@PathVariable("id") int id){
        this.authorService.removeAuthor(id);

        return "redirect:/authors";
    }

    @RequestMapping("/authors/edit/{id}")
    public String editAuthor(@PathVariable("id") int id, Model model){
        model.addAttribute("author", this.authorService.getAuthorById(id));
        model.addAttribute("listAuthors", this.authorService.listAuthors());

        return "authors";
    }

    @RequestMapping("authordata/{id}")
    public String authorData(@PathVariable("id") int id, Model model){
        model.addAttribute("author", this.authorService.getAuthorById(id));

        return "authordata";
    }

}
