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
import gov.nist.csrc.ns.oscal.MarkupBlockQuote;
import gov.nist.csrc.ns.oscal.MarkupCode;
import gov.nist.csrc.ns.oscal.MarkupImage;
import gov.nist.csrc.ns.oscal.MarkupInsert;
import gov.nist.csrc.ns.oscal.MarkupList;
import gov.nist.csrc.ns.oscal.MarkupListItem;
import gov.nist.csrc.ns.oscal.MarkupOrderedList;
import gov.nist.csrc.ns.oscal.MarkupPreformatted;
import gov.nist.csrc.ns.oscal.OSCALPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markup List Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getA <em>A</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getBr <em>Br</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getEm <em>Em</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getI <em>I</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getB <em>B</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getImg <em>Img</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl#getP <em>P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkupListItemImpl extends MinimalEObjectImpl.Container implements MarkupListItem {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkupListItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getMarkupListItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, OSCALPackage.MARKUP_LIST_ITEM__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(OSCALPackage.eINSTANCE.getMarkupListItem_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupAnchor> getA() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupInsert> getInsert() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Insert());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getBr() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Br());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupCode> getCode() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getEm() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getI() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getB() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getStrong() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getSub() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getSup() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getQ() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Q());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupImage> getImg() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Img());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupList> getUl() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Ul());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupOrderedList> getOl() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Ol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupPreformatted> getPre() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Pre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getHr() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Hr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupBlockQuote> getBlockquote() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_Blockquote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH1() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_H1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH2() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_H2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH3() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_H3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH4() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_H4());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH5() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_H5());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH6() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_H6());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getP() {
		return getGroup().list(OSCALPackage.eINSTANCE.getMarkupListItem_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.MARKUP_LIST_ITEM__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__INSERT:
				return ((InternalEList<?>)getInsert()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__UL:
				return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__OL:
				return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__H1:
				return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__H2:
				return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__H3:
				return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__H4:
				return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__H5:
				return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__H6:
				return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_LIST_ITEM__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.MARKUP_LIST_ITEM__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case OSCALPackage.MARKUP_LIST_ITEM__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OSCALPackage.MARKUP_LIST_ITEM__A:
				return getA();
			case OSCALPackage.MARKUP_LIST_ITEM__INSERT:
				return getInsert();
			case OSCALPackage.MARKUP_LIST_ITEM__BR:
				return getBr();
			case OSCALPackage.MARKUP_LIST_ITEM__CODE:
				return getCode();
			case OSCALPackage.MARKUP_LIST_ITEM__EM:
				return getEm();
			case OSCALPackage.MARKUP_LIST_ITEM__I:
				return getI();
			case OSCALPackage.MARKUP_LIST_ITEM__B:
				return getB();
			case OSCALPackage.MARKUP_LIST_ITEM__STRONG:
				return getStrong();
			case OSCALPackage.MARKUP_LIST_ITEM__SUB:
				return getSub();
			case OSCALPackage.MARKUP_LIST_ITEM__SUP:
				return getSup();
			case OSCALPackage.MARKUP_LIST_ITEM__Q:
				return getQ();
			case OSCALPackage.MARKUP_LIST_ITEM__IMG:
				return getImg();
			case OSCALPackage.MARKUP_LIST_ITEM__UL:
				return getUl();
			case OSCALPackage.MARKUP_LIST_ITEM__OL:
				return getOl();
			case OSCALPackage.MARKUP_LIST_ITEM__PRE:
				return getPre();
			case OSCALPackage.MARKUP_LIST_ITEM__HR:
				return getHr();
			case OSCALPackage.MARKUP_LIST_ITEM__BLOCKQUOTE:
				return getBlockquote();
			case OSCALPackage.MARKUP_LIST_ITEM__H1:
				return getH1();
			case OSCALPackage.MARKUP_LIST_ITEM__H2:
				return getH2();
			case OSCALPackage.MARKUP_LIST_ITEM__H3:
				return getH3();
			case OSCALPackage.MARKUP_LIST_ITEM__H4:
				return getH4();
			case OSCALPackage.MARKUP_LIST_ITEM__H5:
				return getH5();
			case OSCALPackage.MARKUP_LIST_ITEM__H6:
				return getH6();
			case OSCALPackage.MARKUP_LIST_ITEM__P:
				return getP();
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
			case OSCALPackage.MARKUP_LIST_ITEM__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__A:
				getA().clear();
				getA().addAll((Collection<? extends MarkupAnchor>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__INSERT:
				getInsert().clear();
				getInsert().addAll((Collection<? extends MarkupInsert>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends EObject>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends MarkupCode>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__I:
				getI().clear();
				getI().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__B:
				getB().clear();
				getB().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends MarkupImage>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends MarkupList>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends MarkupOrderedList>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends MarkupPreformatted>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends EObject>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends MarkupBlockQuote>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__H1:
				getH1().clear();
				getH1().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__H2:
				getH2().clear();
				getH2().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__H3:
				getH3().clear();
				getH3().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__H4:
				getH4().clear();
				getH4().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__H5:
				getH5().clear();
				getH5().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__H6:
				getH6().clear();
				getH6().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__P:
				getP().clear();
				getP().addAll((Collection<? extends InlineMarkup>)newValue);
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
			case OSCALPackage.MARKUP_LIST_ITEM__MIXED:
				getMixed().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__GROUP:
				getGroup().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__A:
				getA().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__INSERT:
				getInsert().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__BR:
				getBr().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__CODE:
				getCode().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__EM:
				getEm().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__I:
				getI().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__B:
				getB().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__STRONG:
				getStrong().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__SUB:
				getSub().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__SUP:
				getSup().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__Q:
				getQ().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__IMG:
				getImg().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__UL:
				getUl().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__OL:
				getOl().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__PRE:
				getPre().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__HR:
				getHr().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__H1:
				getH1().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__H2:
				getH2().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__H3:
				getH3().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__H4:
				getH4().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__H5:
				getH5().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__H6:
				getH6().clear();
				return;
			case OSCALPackage.MARKUP_LIST_ITEM__P:
				getP().clear();
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
			case OSCALPackage.MARKUP_LIST_ITEM__MIXED:
				return mixed != null && !mixed.isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__GROUP:
				return !getGroup().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__A:
				return !getA().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__INSERT:
				return !getInsert().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__BR:
				return !getBr().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__CODE:
				return !getCode().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__EM:
				return !getEm().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__I:
				return !getI().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__B:
				return !getB().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__STRONG:
				return !getStrong().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__SUB:
				return !getSub().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__SUP:
				return !getSup().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__Q:
				return !getQ().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__IMG:
				return !getImg().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__UL:
				return !getUl().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__OL:
				return !getOl().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__PRE:
				return !getPre().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__HR:
				return !getHr().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__H1:
				return !getH1().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__H2:
				return !getH2().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__H3:
				return !getH3().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__H4:
				return !getH4().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__H5:
				return !getH5().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__H6:
				return !getH6().isEmpty();
			case OSCALPackage.MARKUP_LIST_ITEM__P:
				return !getP().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //MarkupListItemImpl
