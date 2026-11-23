/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Print Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Service that provides support for printing. The basic assumption of the Printing Model is that a PrintService accepts a PrintJob for processing, using its PrintSAP. The Job is then placed on a PrintQueue (that is indicated by the QueueForPrintService association). Printers take Jobs from Queues (indicated by the PrinterServicingQueue association). The ABNF for CIM references to PWG Standards and MIBs is in the directory 'ftp://ftp.pwg.org/pub/pwg/general/process' in the file 'pwg-cim-references-format-20060309.txt'. An example for a MappingStrings reference to a PWG Standard is 'PWG5101-1.PWG|Section 4 Media Color Names'. An example for a MappingStrings reference to a PWG MIB is 'MIB.PWG|PWG-IMAGING-COUNTER-MIB.icMonitorCompletedJobs'.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PrintService#getPaperTypesAvailable <em>Paper Types Available</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintService#getLanguagesSupported <em>Languages Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintService#getMimeTypesSupported <em>Mime Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintService#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintService#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintService#getAvailableFilters <em>Available Filters</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrintService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' UMLPackagePath='CIM::Device::Printing' override.Description='string' override.Description.Required='true' override.Description.Description='The description of this specific instance of PrintService. \nThis text shall be generated as a factory default by the manufacturer and may be changed out-of-band by the system administrator.' override.Description.MappingStrings='[\"RFC2911.IETF|Section 4.4.6 printer-info\"]' override.ElementName='string' override.ElementName.Required='true' override.ElementName.Description='The user-friendly name for this instance of PrintService. In addition, the user-friendly name can be used as an index property for a search or query. (Note: The name does not have to be unique within a namespace.) This name shall be generated as a factory default by the manufacturer and may be changed out-of-band to a site-specific name by the system administrator.' override.ElementName.MappingStrings='[\"RFC2911.IETF|Section 4.4.4 printer-name\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PrintService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Paper Types Available</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings that specifies the types and sizes of paper that can be used by Jobs that are submitted to this PrintService. This list can be different than the paper types that are installed on the Printer, because the PrintService can include support for manually making other types available or only a subset of paper types can be exported using this PrintService. The values of the property SHOULD conform to the requirements of the PWG Media Standardized Names specification [PWG5101.1], which defines the normative values for this property. See older Appendix B 'Media Size Names' and Appendix C 'Media Names' of IETF Printer MIB v2 [RFC3805] which list the values of standardized media names defined in ISO DPA [ISO10175].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paper Types Available</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintService_PaperTypesAvailable()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MappingStrings='[\"PWG5101-1.PWG|Media Standardized Names\",\"MIB.IETF|Printer-MIB.prtInputMediaName\",\"RFC2911.IETF|Printer.media-supported\",\"RFC2911.IETF|Section 4.2 Job Template Attributes\",\"RFC2911.IETF|Section 4.2.11 media\",\"RFC2911.IETF|APPENDIX C \'media\' keyword values\"]' ModelCorrespondence='[\"CIM_Printer.PaperTypesAvailable\",\"CIM_PrintJob.RequiredPaperType\"]'"
	 * @generated
	 */
	EList<String> getPaperTypesAvailable();

	/**
	 * Returns the value of the '<em><b>Languages Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use MimeTypesSupported. 
	 * Enumerated print languages are only available in the IETF Printer MIB v1/v2 (RFC 1759/3805) and are not available in open standard print protocols (i.e., no known mapping). 
	 * Deprecated description: 
	 * An array that indicates the print languages that are supported by the PrintService. A PrintService can support more languages than those available on the underlying Printer through the use of filters. An administrator can also choose to prevent some languages from being exported by the PrintService. 
	 * Note: For legacy compatiblity reasons, this property is NOT exactly aligned (in order of values) with the authoritative PrtInterpreterLangFamilyTC in the IANA Printer MIB, unlike the newer property PrintInterpreter.LangType (which is exactly aligned with the IANA Printer MIB).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Languages Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintService_LanguagesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_PrintService.MimeTypesSupported\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"..\"]' Values='[\"Other\",\"Unknown\",\"PCL\",\"HPGL\",\"PJL\",\"PS\",\"PSPrinter\",\"IPDS\",\"PPDS\",\"EscapeP\",\"Epson\",\"DDIF\",\"Interpress\",\"ISO6429\",\"Line Data\",\"MODCA\",\"REGIS\",\"SCS\",\"SPDL\",\"TEK4014\",\"PDS\",\"IGP\",\"CodeV\",\"DSCDSE\",\"WPS\",\"LN03\",\"CCITT\",\"QUIC\",\"CPAP\",\"DecPPL\",\"Simple Text\",\"NPAP\",\"DOC\",\"imPress\",\"Pinwriter\",\"NPDL\",\"NEC201PL\",\"Automatic\",\"Pages\",\"LIPS\",\"TIFF\",\"Diagnostic\",\"CaPSL\",\"EXCL\",\"LCDS\",\"XES\",\"MIME\",\"TIPSI\",\"Prescribe\",\"LinePrinter\",\"IDP\",\"XJCL\",\"PDF\",\"RPDL\",\"IntermecIPL\",\"UBIFingerprint\",\"UBIDirectProtocol\",\"Fujitsu\",\"PCLXL\",\"ART\",\"CGM\",\"JPEG\",\"CALS1\",\"CALS2\",\"NIRS\",\"C4\",\"XPS\",\"OpenXPS\",\"DMTF Reserved\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInterpreterLangFamily\"]' ModelCorrespondence='[\"CIM_Printer.LanguagesSupported\",\"CIM_PrintJob.Language\"]'"
	 * @generated
	 */
	EList<Integer> getLanguagesSupported();

	/**
	 * Returns the value of the '<em><b>Mime Types Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of input document formats (MIME types) that are supported by the PrintService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Types Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintService_MimeTypesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MappingStrings='[\"RFC2911.IETF|Section 4.4.22 document-format-supported\"]' ModelCorrespondence='[\"CIM_Printer.MimeTypesSupported\",\"CIM_PrintJob.MimeTypes\"]'"
	 * @generated
	 */
	EList<String> getMimeTypesSupported();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use PrintServiceCapabilities properties (e.g., Finishings). 
	 * Deprecated description: 
	 * An array of integers that indicates the capabilities that are supported by this service. Information such as values 'Duplex Printing' or 'Transparency Printing' is specified in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintService_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\"]' Values='[\"Unknown\",\"Other\",\"Color Printing\",\"Duplex Printing\",\"Copies\",\"Collation\",\"Stapling\",\"Transparency Printing\",\"Punch\",\"Cover\",\"Bind\",\"Black and White Printing\",\"One Sided\",\"Two Sided Long Edge\",\"Two Sided Short Edge\",\"Portrait\",\"Landscape\",\"Reverse Portrait\",\"Reverse Landscape\",\"Quality High\",\"Quality Normal\",\"Quality Low\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInterpreterLangFamily\",\"MIB.IETF|IANA-PRINTER-MIB.PrtInterpreterLangFamilyTC\",\"RFC2911.IETF|Section 4.4.22 document-format-supported\"]' ModelCorrespondence='[\"CIM_Printer.Capabilities\",\"CIM_PrintJob.Finishing\",\"CIM_PrintService.CapabilityDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use properties defined in the PrintServiceCapabilities class. 
	 * Deprecated description: 
	 * An array of free-form strings that provides more detailed explanations for any of the Printer features that are indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintService_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PrintService.Capabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Available Filters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. 
	 * Print filter information is not available in open standard print protocols (i.e., no known mapping). 
	 * Deprecated description: 
	 * Describes the filters that are available within this Print Service. For example, a PrintService can convert a Job that is submitted in one page description language to another, so that it can be passed to an available Printer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Filters</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintService_AvailableFilters()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	EList<String> getAvailableFilters();

} // CIM_PrintService
