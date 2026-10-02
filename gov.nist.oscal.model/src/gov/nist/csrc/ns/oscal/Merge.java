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
package gov.nist.csrc.ns.oscal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Merge Controls</b>
 *   : Provides structuring directives that instruct how controls are organized after profile resolution.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Merge#getCombine <em>Combine</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Merge#getFlat <em>Flat</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Merge#isAsIs <em>As Is</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Merge#getCustom <em>Custom</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMerge()
 * @model extendedMetaData="name='oscal-profile-merge-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Merge extends EObject {
	/**
	 * Returns the value of the '<em><b>Combine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combine</em>' containment reference.
	 * @see #setCombine(Combine)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMerge_Combine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='combine' namespace='##targetNamespace'"
	 * @generated
	 */
	Combine getCombine();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Merge#getCombine <em>Combine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combine</em>' containment reference.
	 * @see #getCombine()
	 * @generated
	 */
	void setCombine(Combine value);

	/**
	 * Returns the value of the '<em><b>Flat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flat</em>' containment reference.
	 * @see #setFlat(Flat)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMerge_Flat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flat' namespace='##targetNamespace'"
	 * @generated
	 */
	Flat getFlat();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Merge#getFlat <em>Flat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flat</em>' containment reference.
	 * @see #getFlat()
	 * @generated
	 */
	void setFlat(Flat value);

	/**
	 * Returns the value of the '<em><b>As Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Is</em>' attribute.
	 * @see #isSetAsIs()
	 * @see #unsetAsIs()
	 * @see #setAsIs(boolean)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMerge_AsIs()
	 * @model unsettable="true" dataType="gov.nist.csrc.ns.oscal.AsIsType"
	 *        extendedMetaData="kind='element' name='as-is' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAsIs();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Merge#isAsIs <em>As Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Is</em>' attribute.
	 * @see #isSetAsIs()
	 * @see #unsetAsIs()
	 * @see #isAsIs()
	 * @generated
	 */
	void setAsIs(boolean value);

	/**
	 * Unsets the value of the '{@link gov.nist.csrc.ns.oscal.Merge#isAsIs <em>As Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAsIs()
	 * @see #isAsIs()
	 * @see #setAsIs(boolean)
	 * @generated
	 */
	void unsetAsIs();

	/**
	 * Returns whether the value of the '{@link gov.nist.csrc.ns.oscal.Merge#isAsIs <em>As Is</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>As Is</em>' attribute is set.
	 * @see #unsetAsIs()
	 * @see #isAsIs()
	 * @see #setAsIs(boolean)
	 * @generated
	 */
	boolean isSetAsIs();

	/**
	 * Returns the value of the '<em><b>Custom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom</em>' containment reference.
	 * @see #setCustom(Custom)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMerge_Custom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custom' namespace='##targetNamespace'"
	 * @generated
	 */
	Custom getCustom();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Merge#getCustom <em>Custom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom</em>' containment reference.
	 * @see #getCustom()
	 * @generated
	 */
	void setCustom(Custom value);

} // Merge
