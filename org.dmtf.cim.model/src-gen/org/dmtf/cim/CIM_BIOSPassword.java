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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM BIOS Password</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_BIOSPassword object may be used to instantiate detail information about manageable BIOS-based passwords.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BIOSPassword#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSPassword#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSPassword#getPasswordEncoding <em>Password Encoding</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSPassword#getIsSet <em>Is Set</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BIOSPassword()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.27.0' UMLPackagePath='CIM::System::BIOS' override.CurrentValue='string[]' override.CurrentValue.Description='CurrentValue shall return an empty array.' override.PendingValue='string[]' override.PendingValue.Required='true' override.PendingValue.Description='PendingValue shall return an empty array.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BIOSPassword extends CIM_BIOSAttribute {
	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the minimum string length allowed when modifying this BIOS attribute. A value of NULL SHALL be defined as zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSPassword_MinLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_BIOSPassword.MaxLength\"]'"
	 * @generated
	 */
	Long getMinLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSPassword#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(Long value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the maximum string length allowed when modifying this BIOS attribute. A value of NULL defines the maximum length is unknown. A value of 0 defines the maximum length as 18446744073709551615, the limitation of the property definition as uint64.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSPassword_MaxLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_BIOSPassword.MinLength\"]'"
	 * @generated
	 */
	Long getMaxLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSPassword#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Long value);

	/**
	 * Returns the value of the '<em><b>Password Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PasswordEncoding specifies encoding tag used to denote the format the password string was createdor set with "kbd" denotes a string in hexadecimal format containing keyboard scan code input. An example of a password structured in this format would be "321539191E1F1F11181320", which is the representation of "my password" in US English keyboard scan codes. "ascii" denotes clear text that shall comply with the ASCII character set. Character encodings from " " (decimal 32) to "~" (decimal 126) are supported. An example would be "my password"."pin" denotes that only numeric input in ASCII text is allowed for the password instance. An example would be "1234".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password Encoding</em>' attribute.
	 * @see #setPasswordEncoding(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSPassword_PasswordEncoding()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"65536..4294967295\"]' Values='[\"ascii\",\"kbd\",\"pin\",\"Unicode\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_BIOSServiceCapabilities.SupportedPasswordEncodings\"]'"
	 * @generated
	 */
	Long getPasswordEncoding();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSPassword#getPasswordEncoding <em>Password Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Encoding</em>' attribute.
	 * @see #getPasswordEncoding()
	 * @generated
	 */
	void setPasswordEncoding(Long value);

	/**
	 * Returns the value of the '<em><b>Is Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property returns TRUE if the current password instance is non-blank and FALSE otherwise. This property is provided because the Value property is always defined as NULL for password instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Set</em>' attribute.
	 * @see #setIsSet(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSPassword_IsSet()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsSet();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSPassword#getIsSet <em>Is Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Set</em>' attribute.
	 * @see #getIsSet()
	 * @generated
	 */
	void setIsSet(Boolean value);

} // CIM_BIOSPassword
