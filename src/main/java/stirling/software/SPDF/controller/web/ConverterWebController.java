package stirling.software.SPDF.controller.web;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import jakarta.servlet.http.HttpServletRequest;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.tags.Tag;
import stirling.software.SPDF.utils.UrlUtils;

@Controller
@Tag(name = "Convert", description = "Convert APIs")
public class ConverterWebController {

    @ConditionalOnExpression("#{bookAndHtmlFormatsInstalled}")
    @GetMapping("/book-to-pdf")
    @Hidden
    public String convertBookToPdfForm(Model model, HttpServletRequest request) {
        model.addAttribute("requestURI", UrlUtils.getCurrentPath(request));
        model.addAttribute("currentPage", "book-to-pdf");
        return "convert/book-to-pdf";
    }

    @ConditionalOnExpression("#{bookAndHtmlFormatsInstalled}")
    @GetMapping("/pdf-to-book")
    @Hidden
    public String convertPdfToBookForm(Model model, HttpServletRequest request) {
        model.addAttribute("requestURI", UrlUtils.getCurrentPath(request));
        model.addAttribute("currentPage", "pdf-to-book");
        return "convert/pdf-to-book";
    }

    @GetMapping("/img-to-pdf")
    @Hidden
    public String convertImgToPdfForm(Model model, HttpServletRequest request) {
        model.addAttribute("requestURI", UrlUtils.getCurrentPath(request));
        model.addAttribute("currentPage", "img-to-pdf");
        return "convert/img-to-pdf";
    }

    @GetMapping("/html-to-pdf")
    @Hidden
    public String convertHTMLToPdfForm(Model model, HttpServletRequest request) {
        model.addAttribute("requestURI", UrlUtils.getCurrentPath(request));
        model.addAttribute("currentPage", "html-to-pdf");
        return "convert/html-to-pdf";
    }

    @GetMapping("/markdown-to-pdf")
    @Hidden
    public String convertMarkdownToPdfForm(Model model, HttpServletRequest request) {
        model.addAttribute("currentPage", "markdown-to-pdf");
        model.addAttribute("requestURI", UrlUtils.getCurrentPath(request));
        return "convert/markdown-to-pdf";
    }

    @GetMapping("/url-to-pdf")
    @Hidden
    public String convertURLToPdfForm(Model model, HttpServletRequest request) {
        model.addAttribute("requestURI", UrlUtils.getCurrentPath(request));
        model.addAttribute("currentPage", "url-to-pdf");
        return "convert/url-to-pdf";
    }

    @GetMapping("/pdf-to-img")
    @Hidden
    public String pdfToimgForm(Model model, HttpServletRequest request) {
        model.addAttribute("requestURI", UrlUtils.getCurrentPath(request));
        model.addAttribute("currentPage", "pdf-to-img");
        return "convert/pdf-to-img";
    }

    @GetMapping("/file-to-pdf")
    @Hidden
    public String convertToPdfForm(Model model, HttpServletRequest request) {
        model.addAttribute("requestURI", UrlUtils.getCurrentPath(request));
        model.addAttribute("currentPage", "file-to-pdf");
        return "convert/file-to-pdf";
    }

    // PDF TO......

    @GetMapping("/pdf-to-html")
    @Hidden
    public ModelAndView pdfToHTML(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("convert/pdf-to-html");
        modelAndView.addObject("currentPage", "pdf-to-html");
        modelAndView.addObject("requestURI", UrlUtils.getCurrentPath(request));
        return modelAndView;
    }

    @GetMapping("/pdf-to-presentation")
    @Hidden
    public ModelAndView pdfToPresentation(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("convert/pdf-to-presentation");
        modelAndView.addObject("requestURI", UrlUtils.getCurrentPath(request));
        modelAndView.addObject("currentPage", "pdf-to-presentation");
        return modelAndView;
    }

    @GetMapping("/pdf-to-text")
    @Hidden
    public ModelAndView pdfToText(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("convert/pdf-to-text");
        modelAndView.addObject("requestURI", UrlUtils.getCurrentPath(request));
        modelAndView.addObject("currentPage", "pdf-to-text");
        return modelAndView;
    }

    @GetMapping("/pdf-to-word")
    @Hidden
    public ModelAndView pdfToWord(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("convert/pdf-to-word");
        modelAndView.addObject("requestURI", UrlUtils.getCurrentPath(request));
        modelAndView.addObject("currentPage", "pdf-to-word");
        return modelAndView;
    }

    @GetMapping("/pdf-to-xml")
    @Hidden
    public ModelAndView pdfToXML(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("convert/pdf-to-xml");
        modelAndView.addObject("requestURI", UrlUtils.getCurrentPath(request));
        modelAndView.addObject("currentPage", "pdf-to-xml");
        return modelAndView;
    }

    @GetMapping("/pdf-to-csv")
    @Hidden
    public ModelAndView pdfToCSV(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("convert/pdf-to-csv");
        modelAndView.addObject("requestURI", UrlUtils.getCurrentPath(request));
        modelAndView.addObject("currentPage", "pdf-to-csv");
        return modelAndView;
    }

    @GetMapping("/pdf-to-pdfa")
    @Hidden
    public String pdfToPdfAForm(Model model, HttpServletRequest request) {
        model.addAttribute("requestURI", UrlUtils.getCurrentPath(request));
        model.addAttribute("currentPage", "pdf-to-pdfa");
        return "convert/pdf-to-pdfa";
    }
}
