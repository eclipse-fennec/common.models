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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Element Conforms To Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ElementConformsToProfile association defines the RegisteredProfiles to which the referenced ManagedElement is conformant. Note: This association may apply to any Managed Element. Typical usage will apply it to a higher level instance, such as a System, NameSpace, or Service. When applied to a higher level instance, all constituent parts MUST behave appropriately in support of the ManagedElement's conformance to the named RegisteredProfile.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ElementConformsToProfile#getConformantStandard <em>Conformant Standard</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementConformsToProfile#getManagedElement <em>Managed Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementConformsToProfile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Interop' keys='ConformantStandard,ManagedElement'"
 * @generated
 */
@ProviderType
public interface CIM_ElementConformsToProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Conformant Standard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RegisteredProfile to which the ManagedElement conforms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformant Standard</em>' reference.
	 * @see #setConformantStandard(CIM_RegisteredProfile)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementConformsToProfile_ConformantStandard()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_RegisteredProfile REF' Key='true'"
	 * @generated
	 */
	CIM_RegisteredProfile getConformantStandard();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementConformsToProfile#getConformantStandard <em>Conformant Standard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformant Standard</em>' reference.
	 * @see #getConformantStandard()
	 * @generated
	 */
	void setConformantStandard(CIM_RegisteredProfile value);

	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement that conforms to the RegisteredProfile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element</em>' reference.
	 * @see #setManagedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementConformsToProfile_ManagedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getManagedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementConformsToProfile#getManagedElement <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element</em>' reference.
	 * @see #getManagedElement()
	 * @generated
	 */
	void setManagedElement(CIM_ManagedElement value);

} // CIM_ElementConformsToProfile
