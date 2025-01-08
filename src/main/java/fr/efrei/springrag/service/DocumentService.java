@Service
public class DocumentService {
    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }
    
    public Document buildAndSaveDocument(Document document) {
        log.debug("Request to save Document : {}", document);
        return documentRepository.save(document);
    }

    public List<Document> findAll(){
        log.debug("Reqeust to find all Documents");
        return documentRepository.findAll();
    }

    public List<Document> deleteById(){
        log.debug("Delete document by Id");
        return documentRepository.deleteById();
    }


    public List<Document> findById(){
        log.debug("Find documents by id");
        return documentRepository.findById();
    }
}