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
 * A representation of the model object '<em><b>CIM Software Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SoftwareIdentity provides descriptive information about a software component for asset tracking and/or installation dependency management. When the IsEntity property has the value TRUE, the instance of SoftwareIdentity represents an individually identifiable entity similar to Physical Element. SoftwareIdentity does NOT indicate whether the software is installed, executing, etc. This extra information may be provided through specialized associations to Software Identity. For instance, both InstalledSoftwareIdentity and ElementSoftwareIdentity may be used to indicate that the software identified by this class is installed. SoftwareIdentity is used when managing the software components of a ManagedElement that is the management focus. Since software may be acquired, SoftwareIdentity can be associated with a Product using the ProductSoftwareComponent relationship. The Application Model manages the deployment and installation of software via the classes, SoftwareFeatures and SoftwareElements. SoftwareFeature and SoftwareElement are used when the software component is the management focus. The deployment/installation concepts are related to the asset/identity one. In fact, a SoftwareIdentity may correspond to a Product, or to one or more SoftwareFeatures or SoftwareElements - depending on the granularity of these classes and the deployment model. The correspondence of Software Identity to Product, SoftwareFeature or SoftwareElement is indicated using the ConcreteIdentity association. Note that there may not be sufficient detail or instrumentation to instantiate ConcreteIdentity. And, if the association is instantiated, some duplication of information may result. For example, the Vendor described in the instances of Product and SoftwareIdentity MAY be the same. However, this is not necessarily true, and it is why vendor and similar information are duplicated in this class. 
 * Note that ConcreteIdentity can also be used to describe the relationship of the software to any LogicalFiles that result from installing it. As above, there may not be sufficient detail or instrumentation to instantiate this association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getBuildNumber <em>Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getLargeBuildNumber <em>Large Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getIsLargeBuildNumber <em>Is Large Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getVersionString <em>Version String</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getTargetOperatingSystems <em>Target Operating Systems</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getLanguages <em>Languages</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getClassifications <em>Classifications</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getClassificationDescriptions <em>Classification Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getTargetTypes <em>Target Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getIdentityInfoValue <em>Identity Info Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getIdentityInfoType <em>Identity Info Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getIsEntity <em>Is Entity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getExtendedResourceType <em>Extended Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getOtherExtendedResourceTypeDescription <em>Other Extended Resource Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getMinExtendedResourceTypeMajorVersion <em>Min Extended Resource Type Major Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getMinExtendedResourceTypeMinorVersion <em>Min Extended Resource Type Minor Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getMinExtendedResourceTypeRevisionNumber <em>Min Extended Resource Type Revision Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getMinExtendedResourceTypeBuildNumber <em>Min Extended Resource Type Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareIdentity#getTargetOSTypes <em>Target OS Types</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' ClassConstraint='[\"inv:self.IsLargeBuildNumber=true implies self.BuildNumber = null and self.LargeBuildNumber &lt;&gt; null\",\"inv:self.IsLargeBuildNumber=false implies self.LargeBuildNumber=null\"]' UMLPackagePath='CIM::Core::Software' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareIdentity extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The major number component of the software's version information - for example, '12' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' major release is indicated by a larger numeric value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Major Version</em>' attribute.
	 * @see #setMajorVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_MajorVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMajorVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getMajorVersion <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Version</em>' attribute.
	 * @see #getMajorVersion()
	 * @generated
	 */
	void setMajorVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minor number component of the software's version information - for example, '1' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' minor release is indicated by a larger numeric value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minor Version</em>' attribute.
	 * @see #setMinorVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_MinorVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMinorVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getMinorVersion <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Version</em>' attribute.
	 * @see #getMinorVersion()
	 * @generated
	 */
	void setMinorVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The revision or maintenance release component of the software's version information - for example, '3' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' revision is indicated by a larger numeric value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision Number</em>' attribute.
	 * @see #setRevisionNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_RevisionNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getRevisionNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getRevisionNumber <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Number</em>' attribute.
	 * @see #getRevisionNumber()
	 * @generated
	 */
	void setRevisionNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The build number of the software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Build Number</em>' attribute.
	 * @see #setBuildNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_BuildNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.LargeBuildNumber\",\"CIM_SoftwareIdentity.IsLargeBuildNumber\"]'"
	 * @generated
	 */
	Integer getBuildNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getBuildNumber <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Number</em>' attribute.
	 * @see #getBuildNumber()
	 * @generated
	 */
	void setBuildNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Large Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The build number of the software if IsLargeBuildNumber is TRUE. TheLargeBuildNumber property should be used for all future implementations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Large Build Number</em>' attribute.
	 * @see #setLargeBuildNumber(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_LargeBuildNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_SoftwareIdentity.BuildNumber\",\"CIM_SoftwareIdentity.IsLargeBuildNumber\"]'"
	 * @generated
	 */
	Long getLargeBuildNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getLargeBuildNumber <em>Large Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Build Number</em>' attribute.
	 * @see #getLargeBuildNumber()
	 * @generated
	 */
	void setLargeBuildNumber(Long value);

	/**
	 * Returns the value of the '<em><b>Is Large Build Number</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IsLargeBuildNumber property is used to indicate if the BuildNumber of LargeBuildNumber property contains the value of the software build. A value of TRUE shall indicate that the build number is represented by the LargeBuildNumber property. A value of FALSE shall indicate that the build number is represented by the BuildNumber property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Large Build Number</em>' attribute.
	 * @see #setIsLargeBuildNumber(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_IsLargeBuildNumber()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_SoftwareIdentity.BuildNumber\",\"CIM_SoftwareIdentity.LargeBuildNumber\"]'"
	 * @generated
	 */
	Boolean getIsLargeBuildNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getIsLargeBuildNumber <em>Is Large Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Large Build Number</em>' attribute.
	 * @see #getIsLargeBuildNumber()
	 * @generated
	 */
	void setIsLargeBuildNumber(Boolean value);

	/**
	 * Returns the value of the '<em><b>Version String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string representing the complete software version information - for example, '12.1(3)T'. This string and the numeric major/minor/revision/build properties are complementary. Since vastly different representations and semantics exist for versions, it is not assumed that one representation is sufficient to permit a client to perform computations (i.e., the values are numeric) and a user to recognize the software's version (i.e., the values are understandable and readable). Hence, both numeric and string representations of version are provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version String</em>' attribute.
	 * @see #setVersionString(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_VersionString()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getVersionString();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getVersionString <em>Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version String</em>' attribute.
	 * @see #getVersionString()
	 * @generated
	 */
	void setVersionString(String value);

	/**
	 * Returns the value of the '<em><b>Target Operating Systems</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the target operating systems of the software. This property should be used when a target operating system is not listed in the TargetOSTypes array values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Operating Systems</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_TargetOperatingSystems()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getTargetOperatingSystems();

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of this software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_Manufacturer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language editions supported by the software. The language codes defined in ISO 639 should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Languages</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_Languages()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getLanguages();

	/**
	 * Returns the value of the '<em><b>Classifications</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated integers that classify this software. For example, the software MAY be instrumentation (value=5) or firmware and diagnostic software (10 and 7). The use of value 6, Firmware/BIOS, is being deprecated. Instead, either the value 10 (Firmware) and/or 11 (BIOS/FCode) SHOULD be used. The value 13, Software Bundle, identifies a software package consisting of multiple discrete software instances that can be installed individually or together.
	 * Each contained software instance is represented by an instance of SoftwareIdentity that is associated to this instance of SoftwareIdentityinstance via a Component association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifications</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_Classifications()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Unknown\",\"Other\",\"Driver\",\"Configuration Software\",\"Application Software\",\"Instrumentation\",\"Firmware/BIOS\",\"Diagnostic Software\",\"Operating System\",\"Middleware\",\"Firmware\",\"BIOS/FCode\",\"Support/Service Pack\",\"Software Bundle\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareIdentity.ClassificationDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getClassifications();

	/**
	 * Returns the value of the '<em><b>Classification Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings providing more detailed explanations for any of the entries in the Classifications array. Note that each entry is related to one in the Classifications array located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_ClassificationDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareIdentity.Classifications\"]'"
	 * @generated
	 */
	EList<String> getClassificationDescriptions();

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A manufacturer-allocated number used to identify the software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_SerialNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Target Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings that describes the compatible installer(s). The purpose of the array elements is to establish compatibility between a SoftwareIdentity and a SoftwareInstallationService that can install the SoftwareIdentity by comparing the values of the array elements of this property to the values of SoftwareInstallationServiceCapabilities.SupportedTargetTypes[] property's array elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_TargetTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_SoftwareInstallationServiceCapabilities.SupportedTargetTypes\"]'"
	 * @generated
	 */
	EList<String> getTargetTypes();

	/**
	 * Returns the value of the '<em><b>Identity Info Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IdentityInfoValue captures additional information that MAY be used by an organization to describe or identify a software instance within the context of the organization. For example, large organizations may have several ways to address or identify a particular instance of software depending on where it is stored; a catalog, a web site, or for whom it is intended; development, customer service, etc. The indexed array property IdentityInfoValue contains 0 or more strings that contain a specific identity info string value. IdentityInfoValue is mapped and indexed to IdentityInfoType. When the IdentityInfoValue property is implemented, the IdentityInfoType property MUST be implemented and shall be formatted using the algorithm provided in the IdentityInfoType property Description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Info Value</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_IdentityInfoValue()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MaxLen='256' ModelCorrespondence='[\"CIM_SoftwareIdentity.IdentityInfoType\"]'"
	 * @generated
	 */
	EList<String> getIdentityInfoValue();

	/**
	 * Returns the value of the '<em><b>Identity Info Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indexed array of fixed-form strings that provide the description of the type of information that is stored in the corresponding component of the IdentityInfoValue array. The elements of this property array describe the type of the value in the corresponding elements of the IndetityInfoValue array. When the IdentityInfoValue property is implemented, the IdentityInfoType property MUST be implemented. To insure uniqueness the IdentityInfoType property SHOULD be formatted using the following algorithm: < OrgID > : < LocalID > Where < OrgID > and < LocalID > are separated by a colon (:), and where < OrgID > MUST include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the IdentityInfoType or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the < Schema Name > _ < Class Name > structure of Schema class names.) In addition, to ensure uniqueness, < OrgID > MUST NOT contain a colon (:). When using this algorithm, the first colon to appear in IdentityInfoType MUST appear between < OrgID > and < LocalID > . < LocalID > is chosen by the business entity and SHOULD NOT be reused to identify different underlying software elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Info Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_IdentityInfoType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MaxLen='256' ModelCorrespondence='[\"CIM_SoftwareIdentity.IdentityInfoValue\"]'"
	 * @generated
	 */
	EList<String> getIdentityInfoType();

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date the software was released.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_ReleaseDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getReleaseDate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(String value);

	/**
	 * Returns the value of the '<em><b>Is Entity</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IsEntity property is used to indicate whether the SoftwareIdentity corresponds to a discrete copy of the software component or is being used to convey descriptive and identifying information about software that is not present in the management domain.A value of TRUE shall indicate that the SoftwareIdentity instance corresponds to a discrete copy of the software component. A value of FALSE shall indicate that the SoftwareIdentity instance does not correspond to a discrete copy of the Software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Entity</em>' attribute.
	 * @see #setIsEntity(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_IsEntity()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsEntity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getIsEntity <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Entity</em>' attribute.
	 * @see #getIsEntity()
	 * @generated
	 */
	void setIsEntity(Boolean value);

	/**
	 * Returns the value of the '<em><b>Extended Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The binary format type of the installation package of the software. This property can be used to locate a SoftwareInstallationService capable of installing this software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Resource Type</em>' attribute.
	 * @see #setExtendedResourceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_ExtendedResourceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"Linux RPM\",\"HP-UX Depot\",\"Windows MSI\",\"Solaris Package\",\"Macintosh Disk Image\",\"Debian linux Package\",\"VMware vSphere Installation Bundle\",\"VMware Software Bulletin\",\"HP Smart Component\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_SoftwareIdentity.OtherExtendedResourceTypeDescription\",\"CIM_SoftwareIdentity.MinExtendedResourceTypeMajorVersion\",\"CIM_SoftwareIdentity.MinExtendedResourceTypeMinorVersion\",\"CIM_SoftwareIdentity.MinExtendedResourceTypeRevisionNumber\",\"CIM_SoftwareIdentity.MinExtendedResourceTypeBuildNumber\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypes\"]'"
	 * @generated
	 */
	Integer getExtendedResourceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getExtendedResourceType <em>Extended Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Resource Type</em>' attribute.
	 * @see #getExtendedResourceType()
	 * @generated
	 */
	void setExtendedResourceType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Extended Resource Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the binary format type of the installation package of the software when the ExtendedResourceType property has a value of 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Extended Resource Type Description</em>' attribute.
	 * @see #setOtherExtendedResourceTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_OtherExtendedResourceTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SoftwareIdentity.ExtendedResourceType\",\"CIM_SoftwareIdentity.MinExtendedResourceTypeMajorVersion\",\"CIM_SoftwareIdentity.MinExtendedResourceTypeMinorVersion\",\"CIM_SoftwareIdentity.MinExtendedResourceTypeRevisionNumber\",\"CIM_SoftwareIdentity.MinExtendedResourceTypeBuildNumber\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypes\"]'"
	 * @generated
	 */
	String getOtherExtendedResourceTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getOtherExtendedResourceTypeDescription <em>Other Extended Resource Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Extended Resource Type Description</em>' attribute.
	 * @see #getOtherExtendedResourceTypeDescription()
	 * @generated
	 */
	void setOtherExtendedResourceTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Min Extended Resource Type Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the major number component of the minimum version of the installer, represented by the ExtendedResourceType property, that is required to install this software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Extended Resource Type Major Version</em>' attribute.
	 * @see #setMinExtendedResourceTypeMajorVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_MinExtendedResourceTypeMajorVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.ExtendedResourceType\",\"CIM_SoftwareIdentity.OtherExtendedResourceTypeDescription\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypes\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypesMajorVersions\"]'"
	 * @generated
	 */
	Integer getMinExtendedResourceTypeMajorVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getMinExtendedResourceTypeMajorVersion <em>Min Extended Resource Type Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Extended Resource Type Major Version</em>' attribute.
	 * @see #getMinExtendedResourceTypeMajorVersion()
	 * @generated
	 */
	void setMinExtendedResourceTypeMajorVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Extended Resource Type Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the minor number component of the minimum version of the installer, represented by theExtendedResourceType property, that is required to install this software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Extended Resource Type Minor Version</em>' attribute.
	 * @see #setMinExtendedResourceTypeMinorVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_MinExtendedResourceTypeMinorVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.ExtendedResourceType\",\"CIM_SoftwareIdentity.OtherExtendedResourceTypeDescription\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypes\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypesMinorVersions\"]'"
	 * @generated
	 */
	Integer getMinExtendedResourceTypeMinorVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getMinExtendedResourceTypeMinorVersion <em>Min Extended Resource Type Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Extended Resource Type Minor Version</em>' attribute.
	 * @see #getMinExtendedResourceTypeMinorVersion()
	 * @generated
	 */
	void setMinExtendedResourceTypeMinorVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Extended Resource Type Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the Revision number component of the minimum version of the installer, represented by theExtendedResourceType property, that is required to install this software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Extended Resource Type Revision Number</em>' attribute.
	 * @see #setMinExtendedResourceTypeRevisionNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_MinExtendedResourceTypeRevisionNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.ExtendedResourceType\",\"CIM_SoftwareIdentity.OtherExtendedResourceTypeDescription\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypes\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypesRevisionNumbers\"]'"
	 * @generated
	 */
	Integer getMinExtendedResourceTypeRevisionNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getMinExtendedResourceTypeRevisionNumber <em>Min Extended Resource Type Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Extended Resource Type Revision Number</em>' attribute.
	 * @see #getMinExtendedResourceTypeRevisionNumber()
	 * @generated
	 */
	void setMinExtendedResourceTypeRevisionNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Extended Resource Type Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the Build number component of the minimum version of the installer, represented by theExtendedResourceType property, that is required to install this software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Extended Resource Type Build Number</em>' attribute.
	 * @see #setMinExtendedResourceTypeBuildNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_MinExtendedResourceTypeBuildNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.ExtendedResourceType\",\"CIM_SoftwareIdentity.OtherExtendedResourceTypeDescription\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypes\",\"CIM_SoftwareInstallationServiceCapabilities.SupportedExtendedResourceTypesBuildNumbers\"]'"
	 * @generated
	 */
	Integer getMinExtendedResourceTypeBuildNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareIdentity#getMinExtendedResourceTypeBuildNumber <em>Min Extended Resource Type Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Extended Resource Type Build Number</em>' attribute.
	 * @see #getMinExtendedResourceTypeBuildNumber()
	 * @generated
	 */
	void setMinExtendedResourceTypeBuildNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Target OS Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TargetOSTypes property specifies the target operating systems supported by the software. When the target operating system of the software is not listed in the enumeration values, TargetOperatingSystems[] property should be used to specify the target operating system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target OS Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareIdentity_TargetOSTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"88\",\"89\",\"90\",\"91\",\"92\",\"93\",\"94\",\"95\",\"96\",\"97\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"108\",\"109\",\"110\",\"111\",\"113\",\"114\",\"115\",\"116\",\"117\",\"118\",\"119\",\"120\",\"121\",\"122\",\"123\",\"124\"]' Values='[\"Unknown\",\"Other\",\"MACOS\",\"ATTUNIX\",\"DGUX\",\"DECNT\",\"Tru64 UNIX\",\"OpenVMS\",\"HPUX\",\"AIX\",\"MVS\",\"OS400\",\"OS/2\",\"JavaVM\",\"MSDOS\",\"WIN3x\",\"WIN95\",\"WIN98\",\"WINNT\",\"WINCE\",\"NCR3000\",\"NetWare\",\"OSF\",\"DC/OS\",\"Reliant UNIX\",\"SCO UnixWare\",\"SCO OpenServer\",\"Sequent\",\"IRIX\",\"Solaris\",\"SunOS\",\"U6000\",\"ASERIES\",\"HP NonStop OS\",\"HP NonStop OSS\",\"BS2000\",\"LINUX\",\"Lynx\",\"XENIX\",\"VM\",\"Interactive UNIX\",\"BSDUNIX\",\"FreeBSD\",\"NetBSD\",\"GNU Hurd\",\"OS9\",\"MACH Kernel\",\"Inferno\",\"QNX\",\"EPOC\",\"IxWorks\",\"VxWorks\",\"MiNT\",\"BeOS\",\"HP MPE\",\"NextStep\",\"PalmPilot\",\"Rhapsody\",\"Windows 2000\",\"Dedicated\",\"OS/390\",\"VSE\",\"TPF\",\"Windows (R) Me\",\"Caldera Open UNIX\",\"OpenBSD\",\"Not Applicable\",\"Windows XP\",\"z/OS\",\"Microsoft Windows Server 2003\",\"Microsoft Windows Server 2003 64-Bit\",\"Windows XP 64-Bit\",\"Windows XP Embedded\",\"Windows Vista\",\"Windows Vista 64-Bit\",\"Windows Embedded for Point of Service\",\"Microsoft Windows Server 2008\",\"Microsoft Windows Server 2008 64-Bit\",\"FreeBSD 64-Bit\",\"RedHat Enterprise Linux\",\"RedHat Enterprise Linux 64-Bit\",\"Solaris 64-Bit\",\"SUSE\",\"SUSE 64-Bit\",\"SLES\",\"SLES 64-Bit\",\"Novell OES\",\"Novell Linux Desktop\",\"Sun Java Desktop System\",\"Mandriva\",\"Mandriva 64-Bit\",\"TurboLinux\",\"TurboLinux 64-Bit\",\"Ubuntu\",\"Ubuntu 64-Bit\",\"Debian\",\"Debian 64-Bit\",\"Linux 2.4.x\",\"Linux 2.4.x 64-Bit\",\"Linux 2.6.x\",\"Linux 2.6.x 64-Bit\",\"Linux 64-Bit\",\"Other 64-Bit\",\"Microsoft Windows Server 2008 R2\",\"VMware ESXi\",\"Microsoft Windows 7\",\"CentOS 32-bit\",\"CentOS 64-bit\",\"Oracle Linux 32-bit\",\"Oracle Linux 64-bit\",\"eComStation 32-bitx\",\"Microsoft Windows Server 2011\",\"Microsoft Windows Server 2012\",\"Microsoft Windows 8\",\"Microsoft Windows 8 64-bit\",\"Microsoft Windows Server 2012 R2\",\"Microsoft Windows Server 2016\",\"Microsoft Windows 8.1\",\"Microsoft Windows 8.1 64-bit\",\"Microsoft Windows 10\",\"Microsoft Windows 10 64-bit\",\"Microsoft Windows Server 2019\",\"Microsoft Windows 11 64-bit\",\"Microsoft Windows Server 2022\"]' ModelCorrespondence='[\"CIM_OperatingSystem.OSType\"]'"
	 * @generated
	 */
	EList<Integer> getTargetOSTypes();

} // CIM_SoftwareIdentity
