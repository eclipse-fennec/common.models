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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup Anchor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getPhraseMarkupGroup <em>Phrase Markup Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getEm <em>Em</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getI <em>I</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getB <em>B</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getStrong <em>Strong</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getQ <em>Q</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getImg <em>Img</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor()
 * @model extendedMetaData="name='anchorType' kind='mixed'"
 * @generated
 */
@ProviderType
public interface MarkupAnchor extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Phrase Markup Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phrase Markup Group</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_PhraseMarkupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='PhraseMarkupGroup:1'"
	 * @generated
	 */
	FeatureMap getPhraseMarkupGroup();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#PhraseMarkupGroup:1'"
	 * @generated
	 */
	EList<MarkupCode> getCode();

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Em</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#PhraseMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getEm();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_I()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#PhraseMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getI();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_B()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#PhraseMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getB();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#PhraseMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getStrong();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#PhraseMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getSub();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#PhraseMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getSup();

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_Q()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#PhraseMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getQ();

	/**
	 * Returns the value of the '<em><b>Img</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_Img()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace' group='#PhraseMarkupGroup:1'"
	 * @generated
	 */
	EList<MarkupImage> getImg();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupAnchor_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // MarkupAnchor
