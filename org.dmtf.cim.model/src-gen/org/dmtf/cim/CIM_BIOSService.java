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
 * A representation of the model object '<em><b>CIM BIOS Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from Service that provides the controls to manage the system BIOS configuration of a managed computer system or device. This service exposes functionality to retrieve BIOS configuration data or attributes, set BIOS attribute values, and restore a default configuration of attribute values for a given computer system.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BIOSService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::System::BIOS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_BIOSService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to modify instances of BIOSAttribute associated with this BIOSService.If this method is not supported by the implementation, 1 (Not Supported) shall be returned. If the method is supported, but has not completed due to an unspecified error, 2 (Error) shall be returned. If the method is supported and has completed successfully, 0 (Completed with No Error) shall be returned. The method may return an instance of CIM_Error.
	 * @param TargetBIOS If supplied, TargetBIOS references the scoping instance of CIM_BIOSElement in which the operation is targeted. If TargetBIOS is not supplied, the target of the operation shall be the current instance of CIM_BIOSElement associated to the CIM_ComputerSystem hosting the service.
	 * @param AttributeName A reference to a BIOSAttribute specified by AttributeName of the BIOSAttribute to be modified.
	 * @param AttributeValue A new value to assign to the specified BIOSAttribute. A value of NULL indicates the factory default value for the BIOSAttribute is requested. If this value is valid, it will be applied to the CurrentValue or PendingValue property of the specified BIOSAttribute depending on the system BIOS implementation and any requirements for a system restart.
	 * @param AuthorizationToken When required, a token to modify BIOSAttribute values for this computer system. This is usually the BIOS administrator password. If this is a password, the PasswordEncoding parameter shall be used to denote the format of the password string. For example: the CIM_SharedCredential subclass may be utilized. In that case, the CIM_SharedCredential.Secret might be required and if is not specified this method would return 6 Invalid Parameter. The CIM_SharedCredential.Algorithm property might also be specified based on the property CIM_BIOSServiceCapabilities.SupportedPasswordAlgorithms.
	 * @param PasswordEncoding PasswordEncoding specifies encoding tag used to denote the format the password string is being passed into the BIOS. "kbd" denotes a string in hexadecimal format containing keyboard scan code input. An example of a password structured in this format would be "321539191E1F1F11181320", which is the representation of "my password" in US English keyboard scan codes. "ascii" denotes clear text that shall comply with the ASCII character set. Character encodings from " " (decimal 32) to "~" (decimal 126) are supported. An example would be "my password"."pin" denotes that only numeric input in ASCII text is allowed for the password instance. An example would be "1234".
	 * @param SetResult Invoking the SetBIOSAttribute may result in a set to CurrentValue property or the PendingValue property. SetResult returns the result of invoking the SetBIOSAttribute method when the method return code is 0 completed with no error.
	 * <!-- end-model-doc -->
	 * @model TargetBIOSAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BIOSElement REF' In='true'" AttributeNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' In='true'" AttributeValueUnique="false" AttributeValueMany="true"
	 *        AttributeValueAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' In='true'" AuthorizationTokenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' EmbeddedInstance='CIM_Credential'" PasswordEncodingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' In='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"ascii\",\"kbd\",\"pin\",\"UTF16\",\"DMTF Reserved\",\"Vendor Reserved\"]'" SetResultAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' In='false' Out='true' ValueMap='[\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Set CurrentValue property\",\"Set PendingValue property\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long SetBIOSAttribute(CIM_BIOSElement TargetBIOS, String AttributeName, EList<String> AttributeValue, String AuthorizationToken, Long PasswordEncoding, Long SetResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to modify instances of BIOSAttribute associated with this BIOSService using an embedded instance If this method is not supported by the implementation, 1 (Not Supported) shall be returned. If the method is supported, but has not completed due to an unspecified error, 2 (Error) shall be returned. If the method is supported and has completed successfully, 0 (Completed with No Error) shall be returned. The method may return an instance of CIM_Error.
	 * @param TargetBIOS If supplied, TargetBIOS references the scoping instance of CIM_BIOSElement in which the operation is targeted. If TargetBIOS is not supplied, the target of the operation shall be the current instance of CIM_BIOSElement associated to the CIM_ComputerSystem hosting the service.
	 * @param AttributeConfig AttributeConfig is the input required to modify the value of a BIOSAttribute. The CIM_BIOSAttribute.AttributeName and the CIM_BIOSAttribute.CurrentValue properties are Required for this operation. If both properties are not specified the service shall return 6 Invalid Parameter.
	 * @param AuthorizationToken When required, a token to modify BIOSAttribute values for this computer system. This is usually the BIOS administrator password. If this is a password, the PasswordEncoding parameter shall be used to denote the format of the password string. For example: the CIM_SharedCredential subclass may be utilized. In that case, the CIM_SharedCredential.Secret might be required and if is not specified this method would return 6 Invalid Parameter. The CIM_SharedCredential.Algorithm property might also be specified based on the property CIM_BIOSServiceCapabilities.SupportedPasswordAlgorithms.
	 * @param PasswordEncoding
	 *   PasswordEncoding specifies encoding tag used to denote the format the password string is being passed into the BIOS. This property is applicable if the AuthorizationToken parameter includes a password.
	 *   "kbd" denotes a string in hexadecimal format containing keyboard scan code input. An example of a password structured in this format would be "321539191E1F1F11181320", which is the representation of "my password" in US English keyboard scan codes. "ascii" denotes clear text that shall comply with the ASCII character set. Character encodings from " " (decimal 32) to "~" (decimal 126) are supported. An example would be "my password"."pin" denotes that only numeric input in ASCII text is allowed for the password instance. An example would be "1234".
	 * @param SetResult Invoking the SetBIOSAttributeEmbeddedInstance may result in a set to CurrentValue property or the PendingValue property. SetResult returns the result of invoking the SetBIOSAttributeEmbeddedInstance method when the method return code is 0 completed with no error.
	 * <!-- end-model-doc -->
	 * @model TargetBIOSAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BIOSElement REF' In='true'" AttributeConfigAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' In='true' EmbeddedInstance='CIM_BIOSAttribute'" AuthorizationTokenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' EmbeddedInstance='CIM_Credential'" PasswordEncodingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' In='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"ascii\",\"kbd\",\"pin\",\"UTF16\",\"DMTF Reserved\",\"Vendor Reserved\"]'" SetResultAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' In='false' Out='true' ValueMap='[\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Set CurrentValue property\",\"Set PendingValue property\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long SetBIOSAttributeEmbeddedInstance(CIM_BIOSElement TargetBIOS, String AttributeConfig, String AuthorizationToken, Long PasswordEncoding, Long SetResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method provides the ability to perform raw reads of BIOS configuration storage area. The method will return the lesser of the number of bytes specified by the NumberOfBytes parameter and the actual number of bytes available between Offset and the end of the BIOS area, starting at specified by the Offset parameter arereturned in the Data parameter.
	 * @param TargetBIOS If supplied, TargetBIOS references the scoping instance of CIM_BIOSElement in which the operation is targeted. If TargetBIOS is not supplied, the target of the operation shall be the current instance of CIM_BIOSElement associated to the CIM_ComputerSystem hosting the service.
	 * @param Offset Specifies initial offset to start reading from.
	 * @param NumberOfBytes On input, specifies the number of bytes to read. On output, specifies the number of bytes read.
	 * @param Data Buffer to contain read data.
	 * <!-- end-model-doc -->
	 * @model TargetBIOSAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BIOSElement REF' In='true'" OffsetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Required='true' In='true'" NumberOfBytesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Required='true' In='true' Out='true'" DataUnique="false" DataMany="true"
	 *        DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' In='false' Out='true' Octetstring='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"65536..4294967295\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long ReadRawBIOSData(CIM_BIOSElement TargetBIOS, Long Offset, Long NumberOfBytes, EList<Integer> Data);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method provides the ability to perform raw writes of BIOS configuration storage area. The number of bytes specified by the Length parameter will be written from the Data parameter specified by the Offset parameter. If the number of bytes to write as indicated by the NumberOfBytes parameter exceeds the number of bytes from Offset to the end of the BIOS area, the method shall return 2.
	 * @param TargetBIOS If supplied, TargetBIOS references the scoping instance of CIM_BIOSElement in which the operation is targeted. If TargetBIOS is not supplied, the target of the operation shall be the current instance of CIM_BIOSElement associated to the CIM_ComputerSystem hosting the service.
	 * @param Offset Specifies initial offset to start reading from.
	 * @param NumberOfBytes On input, specifies the number of bytes of data to write. On output, specifies the number of bytes written.
	 * @param Data Buffer containing data to write.
	 * @param AuthorizationToken A token required to modify BIOSAttribute values for this computer system. This is usually the BIOS administrator password. For example: the CIM_SharedCredential subclass may be utilized. In that case, the CIM_SharedCredential.Secret might be required and if is not specified this method would return 6 Invalid Parameter. The CIM_SharedCredential.Algorithm property might also be specified based on the propertyCIM_BIOSServiceCapabilities.SupportedPasswordAlgorithms.
	 * @param PasswordEncoding
	 *   PasswordEncoding specifies encoding tag used to denote the format the password string is being passed into the BIOS. This property is applicable if the AuthorizationToken parameter includes a password. 
	 *   "kbd" denotes a string in hexadecimal format containing keyboard scan code input. An example of a password structured in this format would be "321539191E1F1F11181320", which is the representation of "my password" in US English keyboard scan codes. "ascii" denotes clear text that shall comply with the ASCII character set. Character encodings from " " (decimal 32) to "~" (decimal 126) are supported. An example would be "my password"."pin" denotes that only numeric input in ASCII text is allowed for the password instance. An example would be "1234".
	 * <!-- end-model-doc -->
	 * @model TargetBIOSAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BIOSElement REF' In='true'" OffsetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Required='true' In='true'" NumberOfBytesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Required='true' In='true' Out='true'" DataUnique="false" DataMany="true"
	 *        DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' In='true' Octetstring='true'" AuthorizationTokenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' EmbeddedInstance='CIM_Credential'" PasswordEncodingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' In='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"ascii\",\"kbd\",\"pin\",\"UTF16\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"65536..4294967295\"]' Values='[\"Completed with  No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long WriteRawBIOSData(CIM_BIOSElement TargetBIOS, Long Offset, Long NumberOfBytes, EList<Integer> Data, String AuthorizationToken, Long PasswordEncoding);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called to modify a group of BIOSAttribute instances associated with this BIOSService. If the method is not supported by the implementation, 1 (Not Supported) shall be returned. If the method is supported, but has not completed due to an unspecified error, 2 (Error) shall be returned. If the method is supported and has completed successfully, 0 (Completed with No Error) shall be returned; SetResult[] should be inspected to determine if individual BIOS Attribute values have been set. The method may return an instance of CIM_Error.
	 * @param TargetBIOS If supplied, TargetBIOS references the scoping instance of CIM_BIOSElement in which the operation is targeted. If TargetBIOS is not supplied, the target of the operation shall be the current instance of CIM_BIOSElement associated to the CIM_ComputerSystem hosting the service.
	 * @param CollectionElementName If supplied, the ConcreteCollection containing the BIOS Attributes to be modified, as specified by the ConcreteCollection.ElementName property. The value of ConcreteCollection.ElementName supplied for this parameter must be unique within the scope of the instantiating Namespace; if the value is not unique, this parameter shall not be supplied. If BIOS Attributes represented by the AttributeName[] parameter are not members of this collection, the SetResult parameter that corresponds to these BIOS Attributes shall return 5 (No Attempt to Set Value due to Error). If CollectionElementName is not specified, the BIOS Attributes represented by the AttributeName[] parameter can be members of any collection or associated with no collection at all.
	 * @param AttributeName The BIOS Attribute names representing the BIOS Attributes to be modified, as specified by BIOSAttribute.AttributeName properties. The specified BIOS Attributes must already exist. The values of BIOSAttribute.AttributeName supplied for this parameter must be unique within the scope of the instantiating Namespace. The BIOS Attribute name members of this array must correspond with array members of the values represented by the AttributeValue[] parameter. If more than one value is specified for a particular BIOS Attribute, this parameter shall contain multiple identical array entries describing the BIOS Attribute name that corresponds with each respective BIOS Attribute value specified by the AttributeValue[] parameter.
	 * @param AttributeValue New values to assign to the BIOS Attributes specified in the AttributeName[] parameter. The BIOS Attribute value members of this array must correspond with the array members of the names represented by the AttributeName[] parameter. If more than one value is specified for a particular BIOS Attribute, this parameter shall contain an entry for each BIOS Attribute value. A value of NULL indicates the factory default values for the BIOSAttribute is requested. If this value is valid, it will be applied to the CurrentValue or PendingValue property of the specified BIOSAttribute depending on the system BIOS implementation and any requirements for a system restart. The result of applying the values are described in the corresponding array entries of the SetResult[] parameter.
	 * @param AuthorizationToken When required, a token to modify BIOSAttribute values for this computer system. This is usually the BIOS administrator password. If this is a password, the PasswordEncoding parameter shall be used to denote the format of the password string. For example: the CIM_SharedCredential subclass may be utilized. In that case, the CIM_SharedCredential.Secret might be required and if is not specified this method would return 6 Invalid Parameter. The CIM_SharedCredential.Algorithm property might also be specified based on the propertyCIM_BIOSServiceCapabilities.SupportedPasswordAlgorithms.
	 * @param PasswordEncoding PasswordEncoding specifies encoding tag used to denote the format the password string is being passed into the BIOS. "kbd" denotes a string in hexadecimal format containing keyboard scan code input. An example of a password structured in this format would be "321539191E1F1F11181320", which is the representation of "my password" in US English keyboard scan codes. "ascii" denotes clear text that shall comply with the ASCII character set. Character encodings from " " (decimal 32) to "~" (decimal 126) are supported. An example would be "my password"."pin" denotes that only numeric input in ASCII text is allowed for the password instance. An example would be "1234".
	 * @param SetResult Invoking SetBIOSAttributes may result in new values for BIOS Attributes specified in the AttributeName[] parameter. SetResult returns the results of invoking this method for each specified attribute value. Each array element of SetResult contains the result of setting the new value that corresponds with each respective BIOS Attribute value specified by the AttributeValue[] parameter. If the BIOSAttribute.CurrentValue property is set to the new value, 2 (Set CurrentValue Property) shall be returned. If the BIOSAttribute.PendingValue property is set to the new value, 3 (Set PendingValue Property) shall be returned. If an unspecified error occurred while setting the value, 4 (Error Setting Value) shall be returned. If there was no attempt to set the value due to a prior unspecified error, 5 (No Attempt to Set Value due to Error) shall be returned. If a previously set value was rolled-back to its original value due to a prior unspecified error, 6 (Value Rolled-Back) shall be returned.
	 * <!-- end-model-doc -->
	 * @model TargetBIOSAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BIOSElement REF' In='true'" CollectionElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'" AttributeNameUnique="false" AttributeNameMany="true"
	 *        AttributeNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' In='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_BIOSAttribute.AttributeName\",\"CIM_BIOSService.SetBIOSAttributes.AttributeValue\"]'" AttributeValueUnique="false" AttributeValueMany="true"
	 *        AttributeValueAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' In='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_BIOSAttribute.CurrentValue\",\"CIM_BIOSAttribute.PendingValue\",\"CIM_BIOSService.SetBIOSAttributes.AttributeName\",\"CIM_BIOSService.SetBIOSAttributes.SetResult\"]'" AuthorizationTokenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' EmbeddedInstance='CIM_Credential'" PasswordEncodingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' In='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"ascii\",\"kbd\",\"pin\",\"UTF16\",\"DMTF Reserved\",\"Vendor Reserved\"]'" SetResultUnique="false" SetResultMany="true"
	 *        SetResultAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' In='false' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Set CurrentValue Property\",\"Set PendingValue Property\",\"Error Setting Value\",\"No Attempt to Set Value due to Error\",\"Value Rolled-Back\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_BIOSAttribute.CurrentValue\",\"CIM_BIOSAttribute.PendingValue\",\"CIM_BIOSService.SetBIOSAttributes.AttributeName\",\"CIM_BIOSService.SetBIOSAttributes.AttributeValue\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Error\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long SetBIOSAttributes(CIM_BIOSElement TargetBIOS, String CollectionElementName, EList<String> AttributeName, EList<String> AttributeValue, String AuthorizationToken, Long PasswordEncoding, EList<Long> SetResult);

} // CIM_BIOSService
