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

import gov.nist.csrc.ns.oscal.InlineMarkup;
import gov.nist.csrc.ns.oscal.MarkupAnchor;
import gov.nist.csrc.ns.oscal.MarkupCode;
import gov.nist.csrc.ns.oscal.MarkupImage;
import gov.nist.csrc.ns.oscal.OSCALPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markup Anchor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getPhraseMarkupGroup <em>Phrase Markup Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getEm <em>Em</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getI <em>I</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getB <em>B</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getImg <em>Img</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkupAnchorImpl extends MinimalEObjectImpl.Container implements MarkupAnchor {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkupAnchorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getMarkupAnchor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, OSCALPackage.MARKUP_ANCHOR__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPhraseMarkupGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(OSCALPackage.eINSTANCE.getMarkupAnchor_PhraseMarkupGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupCode> getCode() {
		return getPhraseMarkupGroup().list(OSCALPackage.eINSTANCE.getMarkupAnchor_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getEm() {
		return getPhraseMarkupGroup().list(OSCALPackage.eINSTANCE.getMarkupAnchor_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getI() {
		return getPhraseMarkupGroup().list(OSCALPackage.eINSTANCE.getMarkupAnchor_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getB() {
		return getPhraseMarkupGroup().list(OSCALPackage.eINSTANCE.getMarkupAnchor_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getStrong() {
		return getPhraseMarkupGroup().list(OSCALPackage.eINSTANCE.getMarkupAnchor_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getSub() {
		return getPhraseMarkupGroup().list(OSCALPackage.eINSTANCE.getMarkupAnchor_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getSup() {
		return getPhraseMarkupGroup().list(OSCALPackage.eINSTANCE.getMarkupAnchor_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getQ() {
		return getPhraseMarkupGroup().list(OSCALPackage.eINSTANCE.getMarkupAnchor_Q());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupImage> getImg() {
		return getPhraseMarkupGroup().list(OSCALPackage.eINSTANCE.getMarkupAnchor_Img());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MARKUP_ANCHOR__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MARKUP_ANCHOR__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.MARKUP_ANCHOR__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_ANCHOR__PHRASE_MARKUP_GROUP:
				return ((InternalEList<?>)getPhraseMarkupGroup()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_ANCHOR__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_ANCHOR__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_ANCHOR__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_ANCHOR__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_ANCHOR__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_ANCHOR__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_ANCHOR__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_ANCHOR__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_ANCHOR__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.MARKUP_ANCHOR__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case OSCALPackage.MARKUP_ANCHOR__PHRASE_MARKUP_GROUP:
				if (coreType) return getPhraseMarkupGroup();
				return ((FeatureMap.Internal)getPhraseMarkupGroup()).getWrapper();
			case OSCALPackage.MARKUP_ANCHOR__CODE:
				return getCode();
			case OSCALPackage.MARKUP_ANCHOR__EM:
				return getEm();
			case OSCALPackage.MARKUP_ANCHOR__I:
				return getI();
			case OSCALPackage.MARKUP_ANCHOR__B:
				return getB();
			case OSCALPackage.MARKUP_ANCHOR__STRONG:
				return getStrong();
			case OSCALPackage.MARKUP_ANCHOR__SUB:
				return getSub();
			case OSCALPackage.MARKUP_ANCHOR__SUP:
				return getSup();
			case OSCALPackage.MARKUP_ANCHOR__Q:
				return getQ();
			case OSCALPackage.MARKUP_ANCHOR__IMG:
				return getImg();
			case OSCALPackage.MARKUP_ANCHOR__HREF:
				return getHref();
			case OSCALPackage.MARKUP_ANCHOR__TITLE:
				return getTitle();
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
			case OSCALPackage.MARKUP_ANCHOR__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case OSCALPackage.MARKUP_ANCHOR__PHRASE_MARKUP_GROUP:
				((FeatureMap.Internal)getPhraseMarkupGroup()).set(newValue);
				return;
			case OSCALPackage.MARKUP_ANCHOR__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends MarkupCode>)newValue);
				return;
			case OSCALPackage.MARKUP_ANCHOR__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_ANCHOR__I:
				getI().clear();
				getI().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_ANCHOR__B:
				getB().clear();
				getB().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_ANCHOR__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_ANCHOR__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_ANCHOR__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_ANCHOR__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_ANCHOR__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends MarkupImage>)newValue);
				return;
			case OSCALPackage.MARKUP_ANCHOR__HREF:
				setHref((String)newValue);
				return;
			case OSCALPackage.MARKUP_ANCHOR__TITLE:
				setTitle((String)newValue);
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
			case OSCALPackage.MARKUP_ANCHOR__MIXED:
				getMixed().clear();
				return;
			case OSCALPackage.MARKUP_ANCHOR__PHRASE_MARKUP_GROUP:
				getPhraseMarkupGroup().clear();
				return;
			case OSCALPackage.MARKUP_ANCHOR__CODE:
				getCode().clear();
				return;
			case OSCALPackage.MARKUP_ANCHOR__EM:
				getEm().clear();
				return;
			case OSCALPackage.MARKUP_ANCHOR__I:
				getI().clear();
				return;
			case OSCALPackage.MARKUP_ANCHOR__B:
				getB().clear();
				return;
			case OSCALPackage.MARKUP_ANCHOR__STRONG:
				getStrong().clear();
				return;
			case OSCALPackage.MARKUP_ANCHOR__SUB:
				getSub().clear();
				return;
			case OSCALPackage.MARKUP_ANCHOR__SUP:
				getSup().clear();
				return;
			case OSCALPackage.MARKUP_ANCHOR__Q:
				getQ().clear();
				return;
			case OSCALPackage.MARKUP_ANCHOR__IMG:
				getImg().clear();
				return;
			case OSCALPackage.MARKUP_ANCHOR__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case OSCALPackage.MARKUP_ANCHOR__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case OSCALPackage.MARKUP_ANCHOR__MIXED:
				return mixed != null && !mixed.isEmpty();
			case OSCALPackage.MARKUP_ANCHOR__PHRASE_MARKUP_GROUP:
				return !getPhraseMarkupGroup().isEmpty();
			case OSCALPackage.MARKUP_ANCHOR__CODE:
				return !getCode().isEmpty();
			case OSCALPackage.MARKUP_ANCHOR__EM:
				return !getEm().isEmpty();
			case OSCALPackage.MARKUP_ANCHOR__I:
				return !getI().isEmpty();
			case OSCALPackage.MARKUP_ANCHOR__B:
				return !getB().isEmpty();
			case OSCALPackage.MARKUP_ANCHOR__STRONG:
				return !getStrong().isEmpty();
			case OSCALPackage.MARKUP_ANCHOR__SUB:
				return !getSub().isEmpty();
			case OSCALPackage.MARKUP_ANCHOR__SUP:
				return !getSup().isEmpty();
			case OSCALPackage.MARKUP_ANCHOR__Q:
				return !getQ().isEmpty();
			case OSCALPackage.MARKUP_ANCHOR__IMG:
				return !getImg().isEmpty();
			case OSCALPackage.MARKUP_ANCHOR__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case OSCALPackage.MARKUP_ANCHOR__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", href: ");
		result.append(href);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //MarkupAnchorImpl
