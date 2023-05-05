export class SectionService {
    
    public async sectionsList(): Promise<Array<Section>>{
        const response = await fetch("https://api.mockaroo.com/api/4c0d2bf0?count=50&key=886ff760");
        return await response.json();
    }
    
}
