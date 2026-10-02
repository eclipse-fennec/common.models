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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.AssessmentPart;
import gov.nist.csrc.ns.oscal.InlineMarkup;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MarkupBlockQuote;
import gov.nist.csrc.ns.oscal.MarkupImage;
import gov.nist.csrc.ns.oscal.MarkupLineDatatype;
import gov.nist.csrc.ns.oscal.MarkupList;
import gov.nist.csrc.ns.oscal.MarkupOrderedList;
import gov.nist.csrc.ns.oscal.MarkupPreformatted;
import gov.nist.csrc.ns.oscal.MarkupTable;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getBlockElementGroup <em>Block Element Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getP <em>P</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getTable <em>Table</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getImg <em>Img</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getPart <em>Part</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getNs <em>Ns</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessmentPartImpl extends MinimalEObjectImpl.Container implements AssessmentPart {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected MarkupLineDatatype title;

	/**
	 * The cached value of the '{@link #getProp() <em>Prop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProp()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> prop;

	/**
	 * The cached value of the '{@link #getBlockElementGroup() <em>Block Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap blockElementGroup;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<AssessmentPart> part;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected String ns = NS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getAssessmentPart();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupLineDatatype getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(MarkupLineDatatype newTitle, NotificationChain msgs) {
		MarkupLineDatatype oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PART__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(MarkupLineDatatype newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PART__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PART__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PART__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.ASSESSMENT_PART__PROP);
		}
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBlockElementGroup() {
		if (blockElementGroup == null) {
			blockElementGroup = new BasicFeatureMap(this, OSCALPackage.ASSESSMENT_PART__BLOCK_ELEMENT_GROUP);
		}
		return blockElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH1() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_H1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH2() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_H2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH3() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_H3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH4() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_H4());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH5() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_H5());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH6() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_H6());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupList> getUl() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_Ul());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupOrderedList> getOl() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_Ol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupPreformatted> getPre() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_Pre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getHr() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_Hr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupBlockQuote> getBlockquote() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_Blockquote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getP() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupTable> getTable() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupImage> getImg() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getAssessmentPart_Img());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssessmentPart> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<AssessmentPart>(AssessmentPart.class, this, OSCALPackage.ASSESSMENT_PART__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.ASSESSMENT_PART__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PART__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PART__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNs() {
		return ns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNs(String newNs) {
		String oldNs = ns;
		ns = newNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PART__NS, oldNs, ns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PART__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_PART__TITLE:
				return basicSetTitle(null, msgs);
			case OSCALPackage.ASSESSMENT_PART__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__BLOCK_ELEMENT_GROUP:
				return ((InternalEList<?>)getBlockElementGroup()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__H1:
				return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__H2:
				return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__H3:
				return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__H4:
				return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__H5:
				return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__H6:
				return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__UL:
				return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__OL:
				return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PART__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_PART__TITLE:
				return getTitle();
			case OSCALPackage.ASSESSMENT_PART__PROP:
				return getProp();
			case OSCALPackage.ASSESSMENT_PART__BLOCK_ELEMENT_GROUP:
				if (coreType) return getBlockElementGroup();
				return ((FeatureMap.Internal)getBlockElementGroup()).getWrapper();
			case OSCALPackage.ASSESSMENT_PART__H1:
				return getH1();
			case OSCALPackage.ASSESSMENT_PART__H2:
				return getH2();
			case OSCALPackage.ASSESSMENT_PART__H3:
				return getH3();
			case OSCALPackage.ASSESSMENT_PART__H4:
				return getH4();
			case OSCALPackage.ASSESSMENT_PART__H5:
				return getH5();
			case OSCALPackage.ASSESSMENT_PART__H6:
				return getH6();
			case OSCALPackage.ASSESSMENT_PART__UL:
				return getUl();
			case OSCALPackage.ASSESSMENT_PART__OL:
				return getOl();
			case OSCALPackage.ASSESSMENT_PART__PRE:
				return getPre();
			case OSCALPackage.ASSESSMENT_PART__HR:
				return getHr();
			case OSCALPackage.ASSESSMENT_PART__BLOCKQUOTE:
				return getBlockquote();
			case OSCALPackage.ASSESSMENT_PART__P:
				return getP();
			case OSCALPackage.ASSESSMENT_PART__TABLE:
				return getTable();
			case OSCALPackage.ASSESSMENT_PART__IMG:
				return getImg();
			case OSCALPackage.ASSESSMENT_PART__PART:
				return getPart();
			case OSCALPackage.ASSESSMENT_PART__LINK:
				return getLink();
			case OSCALPackage.ASSESSMENT_PART__CLASS:
				return getClass_();
			case OSCALPackage.ASSESSMENT_PART__NAME:
				return getName();
			case OSCALPackage.ASSESSMENT_PART__NS:
				return getNs();
			case OSCALPackage.ASSESSMENT_PART__UUID:
				return getUuid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_PART__TITLE:
				setTitle((MarkupLineDatatype)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__BLOCK_ELEMENT_GROUP:
				((FeatureMap.Internal)getBlockElementGroup()).set(newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__H1:
				getH1().clear();
				getH1().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__H2:
				getH2().clear();
				getH2().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__H3:
				getH3().clear();
				getH3().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__H4:
				getH4().clear();
				getH4().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__H5:
				getH5().clear();
				getH5().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__H6:
				getH6().clear();
				getH6().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends MarkupList>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends MarkupOrderedList>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends MarkupPreformatted>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends EObject>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends MarkupBlockQuote>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__P:
				getP().clear();
				getP().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends MarkupTable>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends MarkupImage>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends AssessmentPart>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__CLASS:
				setClass((String)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__NAME:
				setName((String)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__NS:
				setNs((String)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PART__UUID:
				setUuid((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_PART__TITLE:
				setTitle((MarkupLineDatatype)null);
				return;
			case OSCALPackage.ASSESSMENT_PART__PROP:
				getProp().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__BLOCK_ELEMENT_GROUP:
				getBlockElementGroup().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__H1:
				getH1().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__H2:
				getH2().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__H3:
				getH3().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__H4:
				getH4().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__H5:
				getH5().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__H6:
				getH6().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__UL:
				getUl().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__OL:
				getOl().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__PRE:
				getPre().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__HR:
				getHr().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__P:
				getP().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__TABLE:
				getTable().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__IMG:
				getImg().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__PART:
				getPart().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__LINK:
				getLink().clear();
				return;
			case OSCALPackage.ASSESSMENT_PART__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case OSCALPackage.ASSESSMENT_PART__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OSCALPackage.ASSESSMENT_PART__NS:
				setNs(NS_EDEFAULT);
				return;
			case OSCALPackage.ASSESSMENT_PART__UUID:
				setUuid(UUID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_PART__TITLE:
				return title != null;
			case OSCALPackage.ASSESSMENT_PART__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.ASSESSMENT_PART__BLOCK_ELEMENT_GROUP:
				return blockElementGroup != null && !blockElementGroup.isEmpty();
			case OSCALPackage.ASSESSMENT_PART__H1:
				return !getH1().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__H2:
				return !getH2().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__H3:
				return !getH3().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__H4:
				return !getH4().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__H5:
				return !getH5().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__H6:
				return !getH6().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__UL:
				return !getUl().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__OL:
				return !getOl().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__PRE:
				return !getPre().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__HR:
				return !getHr().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__P:
				return !getP().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__TABLE:
				return !getTable().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__IMG:
				return !getImg().isEmpty();
			case OSCALPackage.ASSESSMENT_PART__PART:
				return part != null && !part.isEmpty();
			case OSCALPackage.ASSESSMENT_PART__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.ASSESSMENT_PART__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case OSCALPackage.ASSESSMENT_PART__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OSCALPackage.ASSESSMENT_PART__NS:
				return NS_EDEFAULT == null ? ns != null : !NS_EDEFAULT.equals(ns);
			case OSCALPackage.ASSESSMENT_PART__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (blockElementGroup: ");
		result.append(blockElementGroup);
		result.append(", class: ");
		result.append(class_);
		result.append(", name: ");
		result.append(name);
		result.append(", ns: ");
		result.append(ns);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //AssessmentPartImpl
