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
 * A representation of the model object '<em><b>Assessment Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessment Part</b>
 *   : A partition of an assessment plan or results or a child of another part.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getBlockElementGroup <em>Block Element Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getH1 <em>H1</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getH2 <em>H2</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getH3 <em>H3</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getH4 <em>H4</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getH5 <em>H5</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getH6 <em>H6</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getUl <em>Ul</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getOl <em>Ol</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getPre <em>Pre</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getHr <em>Hr</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getP <em>P</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getTable <em>Table</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getImg <em>Img</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getPart <em>Part</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getClass_ <em>Class</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getName <em>Name</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getNs <em>Ns</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPart#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart()
 * @model extendedMetaData="name='oscal-assessment-common-assessment-part-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AssessmentPart extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Part Title</b>
	 *   : A name given to the part, which may be used by a tool for display and navigation.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(MarkupLineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupLineDatatype getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLineDatatype value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Prop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prop' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='props'"
	 * @generated
	 */
	EList<Property> getProp();

	/**
	 * Returns the value of the '<em><b>Block Element Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Element Group</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_BlockElementGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BlockElementGroup:2'"
	 * @generated
	 */
	FeatureMap getBlockElementGroup();

	/**
	 * Returns the value of the '<em><b>H1</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H1</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_H1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h1' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<InlineMarkup> getH1();

	/**
	 * Returns the value of the '<em><b>H2</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H2</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_H2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h2' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<InlineMarkup> getH2();

	/**
	 * Returns the value of the '<em><b>H3</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H3</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_H3()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h3' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<InlineMarkup> getH3();

	/**
	 * Returns the value of the '<em><b>H4</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H4</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_H4()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h4' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<InlineMarkup> getH4();

	/**
	 * Returns the value of the '<em><b>H5</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H5</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_H5()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h5' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<InlineMarkup> getH5();

	/**
	 * Returns the value of the '<em><b>H6</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H6</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_H6()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h6' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<InlineMarkup> getH6();

	/**
	 * Returns the value of the '<em><b>Ul</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ul</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Ul()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ul' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<MarkupList> getUl();

	/**
	 * Returns the value of the '<em><b>Ol</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupOrderedList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ol</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Ol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ol' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<MarkupOrderedList> getOl();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupPreformatted}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Pre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pre' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<MarkupPreformatted> getPre();

	/**
	 * Returns the value of the '<em><b>Hr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hr</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Hr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hr' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<EObject> getHr();

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupBlockQuote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Blockquote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<MarkupBlockQuote> getBlockquote();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<InlineMarkup> getP();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<MarkupTable> getTable();

	/**
	 * Returns the value of the '<em><b>Img</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Img()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace' group='#BlockElementGroup:2'"
	 * @generated
	 */
	EList<MarkupImage> getImg();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.AssessmentPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Part()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='parts'"
	 * @generated
	 */
	EList<AssessmentPart> getPart();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Part Class</b>
	 *   : A textual label that provides a sub-type or characterization of the part's name. This can be used to further distinguish or discriminate between the semantics of multiple parts of the same control with the same name and ns.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Class()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Part Name</b>
	 *   : A textual label that uniquely identifies the part's semantic type.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Name()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Part Namespace</b>
	 *   : A namespace qualifying the part's name. This allows different organizations to associate distinct semantics with the same name.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ns</em>' attribute.
	 * @see #setNs(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Ns()
	 * @model dataType="gov.nist.csrc.ns.oscal.URIDatatype"
	 *        extendedMetaData="kind='attribute' name='ns'"
	 * @generated
	 */
	String getNs();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getNs <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns</em>' attribute.
	 * @see #getNs()
	 * @generated
	 */
	void setNs(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Part Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this part elsewhere in this or other OSCAL instances. The locally defined UUID of the part can be used to reference the data item locally or globally (e.g., in an ported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPart_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // AssessmentPart
